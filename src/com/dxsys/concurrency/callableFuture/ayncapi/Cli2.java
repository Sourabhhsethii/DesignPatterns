package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;

public class Cli2 {
    public static void main(String[] args) throws InterruptedException {
        var future = CompletableFuture.supplyAsync(()-> 1);
        future.thenRun(()-> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });

        future.thenRunAsync(()-> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });

        var future2 = CompletableFuture.supplyAsync(()->{
            return 2;
          });
        future2.thenAcceptAsync(    result->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        Thread.sleep(2000);
    }
}
