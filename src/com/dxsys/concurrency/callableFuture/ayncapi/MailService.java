package com.dxsys.concurrency.callableFuture.ayncapi;

import com.dxsys.concurrency.callableFuture.LongTask;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class MailService {

    /**
     * Send is long running operation, we should not block the main thread instead we should run send on another thread.
     * @throws InterruptedException
     */
    public void send() throws InterruptedException {
        LongTask.simulate();
        System.out.println("Mail was Sent !");
    }

    public CompletableFuture<Void> sendAsync(){
        var executorService = Executors.newFixedThreadPool(12);
        return CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Running onn this -> " + Thread.currentThread().getName());
                send();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);
    }
}
