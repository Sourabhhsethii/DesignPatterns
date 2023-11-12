package com.dxsys.concurrency.project;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Cli {
    public static void main(String[] args) throws InterruptedException {
        var service = new FlightService();

        var start = LocalTime.now();
        var futures = service.getQuotes().map(future -> future.thenAccept(System.out::println)).collect(Collectors.toList());
        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(()->{
                   var end = LocalTime.now();
                    var durations =Duration.between(start, end);
                    System.out.println("Retervice All Quotes " + durations.toString() + " msecs.");
                });
        Thread.sleep(10000);

    }
}
