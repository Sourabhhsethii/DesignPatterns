package com.dxsys.threads.com.dxsys.threads.statergy;

import com.dxsys.threads.com.dxsys.threads.statergy.downloadtask.DownloadFileTask2Conf;

import java.util.ArrayList;
import java.util.List;

/**
 * How to use Confinement???
 * Instead of sharing a single status object across multiple threads.
 * We gone have each thread work on its own status object.
 */
public class Confinement {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask2Conf> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // O(N)
            // Now Every Task has there own status Object!!!
            var task = new DownloadFileTask2Conf();
            tasks.add(task);

            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }
        for (var thread : threads) {
            thread.join();
        }

        var totalBytes = tasks.stream().map(t->t.getStatus().getTotalBytes()).reduce(Integer::sum);

        System.out.println(totalBytes);
    }
}
