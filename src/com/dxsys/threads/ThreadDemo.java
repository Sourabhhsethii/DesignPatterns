package com.dxsys.threads;

import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTask;
import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTask2;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatus;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        // show();
         show2();
    }

  public static  void show() throws InterruptedException {
        System.out.println(Thread.currentThread());
      for (int i = 0; i < 10; i++) {
          Thread thread = new Thread(new DownloadFileTask());
          thread.start();
          thread.join();
          System.out.println("File is ready to be scanned.");
      }
  }

    public static  void show2() throws InterruptedException {
        System.out.println(Thread.currentThread());
        Thread thread = new Thread(new DownloadFileTask2());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
