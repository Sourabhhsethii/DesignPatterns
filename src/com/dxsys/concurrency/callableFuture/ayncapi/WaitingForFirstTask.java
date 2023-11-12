package com.dxsys.concurrency.callableFuture.ayncapi;

import com.dxsys.concurrency.callableFuture.LongTask;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WaitingForFirstTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var first = CompletableFuture.supplyAsync(()-> {
            try {
                LongTask.simulate();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 20;
        });

        var second = CompletableFuture.supplyAsync(()-> 20);

        CompletableFuture.anyOf(first, second)
        .thenAccept(System.out::println);
    }
}
