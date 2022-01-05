package com.dxsys.code.mosh.advance.threads;

import java.util.ArrayList;
import java.util.List;

public class TheadingDemo {

    public static void show(){
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (var i=0;i<10;i++){
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalBytes());
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());

        show();


/*
        System.out.println();
        System.out.println(Thread.currentThread().getName());
*/

      /*  for (var i=0;i<10;i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }*/

       /* Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        thread.join();
        System.out.println("File is ready to be scanned.");*/
    }
}
