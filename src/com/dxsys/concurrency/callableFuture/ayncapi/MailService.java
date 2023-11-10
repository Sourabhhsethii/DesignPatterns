package com.dxsys.concurrency.callableFuture.ayncapi;

import com.dxsys.concurrency.callableFuture.LongTask;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class MailService {
    public void send() throws InterruptedException {
        LongTask.simulate();
        System.out.println("Mail was Sent !");
    }

    public CompletableFuture<Void> sendAsync(){
        var executorService = Executors.newFixedThreadPool(12);
        return CompletableFuture.runAsync(() -> {
            try {
                send();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);
    }
}
