package com.dxsys.threads.com.dxsys.threads.statergy.downloadtask;

import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatus;

public class DownloadFileTask2Conf implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask2Conf() {
        this.status = new DownloadStatus();
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

    public DownloadStatus getStatus() {
        return status;
    }
}
