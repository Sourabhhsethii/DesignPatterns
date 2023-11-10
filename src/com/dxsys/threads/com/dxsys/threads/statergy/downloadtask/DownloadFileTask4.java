package com.dxsys.threads.com.dxsys.threads.statergy.downloadtask;

import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusLock;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusSync;

public class DownloadFileTask4  implements Runnable {

    private DownloadStatusSync status = new DownloadStatusSync();

    public DownloadFileTask4(DownloadStatusSync status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a File " + Thread.currentThread().getName());
        for (int i = 0; i < 10_000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            // System.out.println("Downloading Byte" +  i);
            status.incrementTotalByte();
        }
        System.out.println("Download Completed " + Thread.currentThread().getName());
    }
}