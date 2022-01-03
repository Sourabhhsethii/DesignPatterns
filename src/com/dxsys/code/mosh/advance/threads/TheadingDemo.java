package com.dxsys.code.mosh.advance.threads;

public class TheadingDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());


        System.out.println();

        System.out.println(Thread.currentThread().getName());

      /*  for (var i=0;i<10;i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }*/

        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        thread.join();
        System.out.println("File is ready to be scanned.");
    }
}
