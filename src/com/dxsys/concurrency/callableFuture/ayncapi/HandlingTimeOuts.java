package com.dxsys.concurrency.callableFuture.ayncapi;

import com.dxsys.concurrency.callableFuture.LongTask;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class HandlingTimeOuts {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      var future =  CompletableFuture.supplyAsync(()->{
            try {
                LongTask.simulate();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });

        /***
         * orTimeout -> It will throw timeout exception.
         */
        future.orTimeout(1,TimeUnit.MILLISECONDS);
        System.out.println(future.get());

        /**
         * completeOnTimeout -> This is for returning default value after timeout.
         *
         */
        future.completeOnTimeout(5, 1,TimeUnit.SECONDS);
        System.out.println(future.get());


    }
}
