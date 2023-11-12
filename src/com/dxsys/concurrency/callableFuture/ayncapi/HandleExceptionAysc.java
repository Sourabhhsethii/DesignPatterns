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
           /**
            * To get the exception from another Thread, we need to get it from get Method...
            */
           /**
            * If we want to get the default value in case of exception, we can call exceptionally... I don't want to crash the systems
            */
           System.out.println(future.exceptionally((ex)-> 1).get());
       } catch ( ExecutionException x){
            x.printStackTrace();
       }
        Thread.sleep(3000);
    }

}
