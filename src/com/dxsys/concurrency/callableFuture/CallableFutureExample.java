package com.dxsys.concurrency.callableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * Callable & Future
 * Future Holds the object which will be returned by callable after some time.
 * Thread of execution goes on hold at the point where future variable (like future.get() in bellow example) is called.
 */
public class CallableFutureExample {
    public static void main(String[] args) {
        var executorService = Executors.newFixedThreadPool(12);

        try {
            System.out.println(executorService.getClass().getName());
            var future = executorService.submit(() -> {
                LongTask.simulate();
                return 1;
            });
            System.out.println("Do More Work!!!");
            var result = future.get();
            System.out.println(result);
        } catch ( InterruptedException  | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
