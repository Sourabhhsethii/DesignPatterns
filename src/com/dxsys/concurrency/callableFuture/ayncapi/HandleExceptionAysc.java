package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HandleExceptionAysc {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       var future= CompletableFuture.supplyAsync(()->{
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });
       try {
           future.exceptionally((ex)-> 1).get();
       } catch ( ExecutionException x){
            x.printStackTrace();
       }

        Thread.sleep(3000);
    }

}
