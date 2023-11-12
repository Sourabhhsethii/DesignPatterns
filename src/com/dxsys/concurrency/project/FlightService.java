package com.dxsys.concurrency.project;

import com.dxsys.concurrency.callableFuture.LongTask;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightService {

    public Stream<CompletableFuture<Quote>> getQuotes(){
        var sites = List.of("site1", "site2", "site3");
       return sites.stream().map(this::getQuote);
    }

    public CompletableFuture<Quote> getQuote(String site){
       return CompletableFuture.supplyAsync(()->{
           System.out.println("Getting Quotes from this " + site);

           var random = new Random();
           try {
               LongTask.simulate(1_000 + random.nextInt(10));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            var price = 100 + random.nextInt(10);
            return new Quote(site,price);
        });
    }
}
