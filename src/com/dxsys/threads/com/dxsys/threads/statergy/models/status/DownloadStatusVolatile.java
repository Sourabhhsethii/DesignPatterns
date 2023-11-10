package com.dxsys.threads.com.dxsys.threads.statergy.models.status;

public class DownloadStatusVolatile {

    private volatile boolean isDone;

    public int getTotalBytes() {
        return totalBytes;
    }

    private int totalBytes = 0;

    private int totalFiles;

    private Object totalBytesLock = new Object();


    public void incrementTotalByte() {

        /**
         * Add Sync into Critical Section of the Block!!!
         * Add Monitor object in synchronized keyword. Such as this but this is bad practices!!!
         * Instead Use ->
         *
         */
        synchronized(totalBytesLock) {
            totalBytes++;
        }

    }

    public  boolean isDone() {
        return isDone;
    }

    public  void done() {
        isDone = true;
    }
}
