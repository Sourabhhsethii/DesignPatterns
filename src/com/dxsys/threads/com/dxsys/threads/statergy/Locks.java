package com.dxsys.threads.com.dxsys.threads.statergy;

import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTask3;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusLock;

import java.util.ArrayList;
import java.util.List;

/**
 * Locks->
 * In Syncronization, we put a lock on our block of the code as called as critical section...
 * Here we loose the Concurrency!!! Hotel Room Locking!!!
 * Check the lock in
 */
public class Locks {

    public static void main(String[] args) throws InterruptedException {
        var status = new DownloadStatusLock();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask3(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            thread.join();
        }

        System.out.println(status.getTotalBytes());
    }
}
