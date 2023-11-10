package com.dxsys.threads.com.dxsys.threads.statergy.models.status;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatusSync {

    private int totalBytes = 0;

    private int totalFiles;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();


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

    /**
     * Here also same monitior object (this) is used in this critical section.
     * It will unnesscary add the more waits and reduced the throghtput of the object.
     * Instead of reduce throghtput, use direct monitor object for each piece of the code.
     */
    public void incrementTotalFiles() {

        /**
         * Add Sync into Critical Section of the Block!!!
         * Add Monitor object in synchronized keyword. Such as this but this is bad practices!!!
         * Instead Use -> totalFilesLock, totalBytesLock
         *
         */
        synchronized(totalFilesLock) {
            totalFiles++;
        }

    }


    public int getTotalFiles() {
        return totalFiles;
    }

    public int getTotalBytes() {
        return totalBytes;
    }
}
