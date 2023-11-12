package com.dxsys.concurrency.callableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

/**
 * CompletableFuture Class implement Future interface hence every CompletableFuture is Future Object...
 * It Implements CompletionStage Interface that means A stage of a possibly async computation. Or has many stages where we need to perform task in async.
 * It help us to give many methods to work in declarative way!!!
 */
public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Supplier<Integer> task = () -> 1;
       var future =  java.util.concurrent.CompletableFuture.supplyAsync(task);
        /**
         * get is blocking method, it will block the thread
         */
        System.out.println(future.get());
    }
}
