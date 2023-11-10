package com.dxsys.threads;

import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTask2;
import com.dxsys.threads.com.dxsys.threads.statergy.models.status.DownloadStatus;

import java.util.ArrayList;
import java.util.List;

public class RaceConditions {
    public static void main(String[] args) throws InterruptedException {
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask2(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            thread.join();
        }

        System.out.println(status.getTotalBytes());
    }
}
