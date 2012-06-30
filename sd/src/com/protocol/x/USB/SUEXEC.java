package com.protocol.x.USB;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.util.Timer;

public class SUEXEC
{

  public ExecuteThread executeThread = new ExecuteThread();
  Process process = null;
  public String scriptOutput = "";
  Boolean scriptRunning = Boolean.valueOf(false);
  Thread stdinThread = null;
  Boolean stdoutFinished = Boolean.valueOf(false);
  Thread stdoutThread = null;
  public String xCmd = "";

  public class ExecuteThread extends Thread
  {
    public ExecuteThread()
    {
    }

    void Execute()
    {
      try
      {
        SUEXEC.this.process = Runtime.getRuntime().exec("su");// the app must run under the privallege "su"
        DataOutputStream localDataOutputStream = new DataOutputStream(SUEXEC.this.process.getOutputStream());
        DataInputStream localDataInputStream = new DataInputStream(SUEXEC.this.process.getInputStream()); // examplize in and out stream
        SUEXEC.this.stdinThread = new Thread()
        {
          public void run()
          {
            super.setPriority(1);
            while (true)
            {
              if (!SUEXEC.this.scriptRunning.booleanValue())
                return;
              try
              {
                Thread.sleep(200L);
              }
              catch (Exception localException)
              {
              }
            }
          }
        };
        SUEXEC.this.stdoutThread = new Thread((Runnable) localDataInputStream)
        {
          private Object val$stdout;

		public void run()
          {
            super.setPriority(1);
            try
            {
              StringBuilder localStringBuilder = new StringBuilder();//dynemical
              while (true)
              {
                int i = ((FilterInputStream) this.val$stdout).read();
                if (i == -1)
                {
                  SUEXEC.this.scriptOutput = localStringBuilder.toString();
                  ((FilterInputStream) this.val$stdout).close();
                  SUEXEC.this.stdoutFinished = Boolean.valueOf(true);
                  break;
                }// output cmd to stdout object in SDInfo via script 
                localStringBuilder.append((char)i);
              }
            }
            catch (Exception localException)
            {
            }
          }
        };
        SUEXEC.this.scriptRunning = Boolean.valueOf(true);
        SUEXEC.this.stdoutThread.start();
        SUEXEC.this.stdinThread.start();
        localDataOutputStream.writeBytes(SUEXEC.this.xCmd + "\n");
        localDataOutputStream.writeBytes("exit\n");
        localDataOutputStream.flush();
        SUEXEC.this.process.waitFor();
        while (!SUEXEC.this.stdoutFinished.booleanValue());
        localDataInputStream.close();
        localDataOutputStream.close();
        SUEXEC.this.stdoutThread = null;
        SUEXEC.this.stdinThread = null;
        SUEXEC.this.scriptRunning = Boolean.valueOf(false);
        SUEXEC.this.process.destroy();
         return;
      }
      catch (Exception localException)
      {
      }
    }

    public void run()
    {
      super.setPriority(1);//set the highest priority
      Execute();
    }
  }
}
