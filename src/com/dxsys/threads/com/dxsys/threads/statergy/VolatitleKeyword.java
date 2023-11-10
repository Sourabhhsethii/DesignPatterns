package com.dxsys.threads.com.dxsys.threads.statergy;

import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTaskVolative;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusVolatile;

/**
 * It solve the visibility problem, instead of avaoind race condtition.
 */
public class VolatitleKeyword {

    public static void main(String[] args) {
        var status = new DownloadStatusVolatile();
        var thread1 = new Thread(new DownloadFileTaskVolative(status));
        var thread2 = new Thread(()-> {
           while (!status.isDone()) {
               synchronized (status) {
                   try {
                       status.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
            System.out.println(status.getTotalBytes());
        });
        thread1.start();
        thread2.start();
    }
}
