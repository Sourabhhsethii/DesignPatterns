package com.dxsys.concurrency.callableFuture;

public class LongTask {
    public static void simulate() throws InterruptedException {
        Thread.sleep(30_00);
    }

    public static void simulate(int delay) throws InterruptedException {
        Thread.sleep(delay);
    }
}
