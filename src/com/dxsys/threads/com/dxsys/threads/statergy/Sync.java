package com.dxsys.threads.com.dxsys.threads.statergy;

import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTask3;
import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTask4;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusLock;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatusSync;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Sync {

    public static void main(String[] args) throws InterruptedException {
        var status = new DownloadStatusSync();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask4(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            thread.join();
        }

        System.out.println(status.getTotalBytes());
    }
}
