package com.dxsys.concurrency.callableFuture.ayncapi;

import java.util.concurrent.CompletableFuture;

public class Cli {
    public static void main(String[] args) throws InterruptedException {
        var service  = new MailService();
        service.sendAsync();
        System.out.println("Hello World !!");

        Thread.sleep(5000);
    }

}
