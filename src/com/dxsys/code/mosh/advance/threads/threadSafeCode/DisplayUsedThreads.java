package com.dxsys.code.mosh.advance.threads.threadSafeCode;

public class DisplayUsedThreads {

    public static void main(String[] args) {
        System.out.println("Using Threads :"+Thread.activeCount());
        System.out.println("Total Threads : "+Runtime.getRuntime().availableProcessors());
    }
}
