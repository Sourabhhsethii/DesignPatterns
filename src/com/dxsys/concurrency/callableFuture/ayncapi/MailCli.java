package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;

public class MailCli {
    public static void main(String[] args) throws InterruptedException {
        var service  = new MailService();
        service.sendAsync();
        System.out.println("Running on this Thread -> " + Thread.currentThread().getName());
        System.out.println("Hello World !!");
        Thread.sleep(5000);
    }

}
