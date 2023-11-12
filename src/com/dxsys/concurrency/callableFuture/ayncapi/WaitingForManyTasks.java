package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WaitingForManyTasks {
    public static void main(String[] args) {
        var first = CompletableFuture.supplyAsync(()-> 1);
        var second = CompletableFuture.supplyAsync(()-> 2);
        var third = CompletableFuture.supplyAsync(()-> 3);
        var all = CompletableFuture.allOf(first,second,third);
        /**
         * Waiting for the Response!!! and ThenRun below block.
         */
        all.thenRun(()-> {
            try {
               var firstResult =  first.get();
                System.out.println(firstResult);
                var secondResult =  second.get();
                System.out.println(secondResult);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println("All Task completed successfully");
        });
    }
}
