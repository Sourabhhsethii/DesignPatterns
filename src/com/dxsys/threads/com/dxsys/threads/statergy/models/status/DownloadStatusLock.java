package com.dxsys.threads.com.dxsys.threads.statergy.models.status;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatusLock {
    /**
     * ReentrantLock is one of the implementation of Lock interface which is available  in  util.concurrent package.
     */
    private Lock lock = new ReentrantLock();

    private int totalBytes = 0;
    private int totalFiles;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalByte() {
        lock.lock();
        /**
         * Much have try block & release the lock in finally so that if any exception come in critical section block of the code, it should cause the deadlock conditions.
         */
        try {
            totalBytes++;
        } finally {
            lock.unlock();
        }

    }

}
