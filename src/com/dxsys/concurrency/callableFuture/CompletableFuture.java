package com.dxsys.concurrency.callableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Supplier<Integer> task = () -> 1;
       var future =  java.util.concurrent.CompletableFuture.supplyAsync(task);
        System.out.println(future.get());

    }
}
