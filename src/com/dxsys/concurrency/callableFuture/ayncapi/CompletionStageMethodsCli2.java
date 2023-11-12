package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;

/**
 * When we need Store the result in db or display the result using after async operations
 */
public class CompletionStageMethodsCli2 {
    public static void main(String[] args) throws InterruptedException {
        var future = CompletableFuture.supplyAsync(()-> 1);
        /**
         * thenRun provided by completion stage interface.
         * completion stage has methods in which it represent a stage in a async operations.
         * thenRun means run the code in block once the code is finished by future object.
         */
        future.thenRun(()-> {
            System.out.println("thenRun means run the code in block once the code is finished by future object");
            System.out.println("Thread Name->" + Thread.currentThread().getName());
            System.out.println("Done");
        });

        /**
         * thenRunAsync means run the code in block once the code is finished by future object in asyn manner by another thread from executor framework.
         */
        future.thenRunAsync(()-> {
            System.out.println("thenRunAsync means run the code in block once the code is finished by future object in asyn manner by another thread from executor framework.");
            System.out.println("Thread Name->" + Thread.currentThread().getName());
            System.out.println("Done");
        });

        var future2 = CompletableFuture.supplyAsync(()->{
            return 2;
          });
        /**
         * thenAccept -> Main Thread.
         * thenAcceptAsync -> Submit this task to Thread pool of executor framework.
         * thenAcceptAsync means it will take consumer object & does not return any value.
         */
        future2.thenAcceptAsync(    result->{
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        Thread.sleep(2000);
    }
}
