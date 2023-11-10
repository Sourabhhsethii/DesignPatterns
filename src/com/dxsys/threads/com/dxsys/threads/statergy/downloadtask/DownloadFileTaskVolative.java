package com.dxsys.threads.com.dxsys.threads.statergy.downloadtask;

import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusSync;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusVolatile;

public class DownloadFileTaskVolative implements Runnable {

    private DownloadStatusVolatile status;

    public DownloadFileTaskVolative(DownloadStatusVolatile status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a File " + Thread.currentThread().getName());
        for (int i = 0; i < 1_000_000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            // System.out.println("Downloading Byte" +  i);
            status.incrementTotalByte();
        }
        status.done();
        synchronized (status) {
            status.notify();
        }
        System.out.println("Download Completed " + Thread.currentThread().getName());
    }
}