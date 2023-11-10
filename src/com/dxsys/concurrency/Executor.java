package com.dxsys.concurrency;

import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        var executorService = Executors.newFixedThreadPool(12);

        try {
            System.out.println(executorService.getClass().getName());
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        } finally {
            executorService.shutdown();
        }
        // ...

    }
}
