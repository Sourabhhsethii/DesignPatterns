package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;

public class CombiningCompletableFutures {
    public static void main(String[] args) {
        // 20 USD -> First Service
        // 0.9 USD -> Second Service
        var first = CompletableFuture
                .supplyAsync(()->"20USD")
                .thenApply(str -> {
                    var price = str.replace("USD", "");
                    return Integer.parseInt(price);
                });
        var second = CompletableFuture.supplyAsync(()->0.9);
        first.thenCombine(second,(price,exchangeRate) -> price * exchangeRate)
                .thenAccept(System.out::println);
    }
}
