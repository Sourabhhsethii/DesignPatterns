package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;

public class ComposingCompletableFuture {

    public static CompletableFuture<String> getUserEmailAsync(){
        return CompletableFuture.supplyAsync(()-> "email");
    }

    public  static CompletableFuture<String> getPlayListAsync(String email){
        return CompletableFuture.supplyAsync(()-> "playlist");
    }

    public static void main(String[] args) {
        // id -> email -> Lets take it from DB.
        getUserEmailAsync()
        .thenCompose(ComposingCompletableFuture::getPlayListAsync)
                .thenAccept(System.out::println);
        // email -> playlist

    }
}
