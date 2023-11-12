package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTransformations {

    public static int toFahrenheit(int celsius){
        return (int) (celsius * 1.8) + 32;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var future = CompletableFuture.supplyAsync(()->20);
        var result = future
                /**
                   then Apply Means execute this code once the future is complete.
                 thenApply will give us new completeable Future
                 **/
                .thenApply(CompletableFutureTransformations::toFahrenheit)
                /**
                 *
                 */
                .thenAccept(f -> System.out.println(f));
        System.out.println(result.get());
    }
}
