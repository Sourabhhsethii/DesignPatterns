package com.dxsys.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SyncronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());

        var thread = new Thread( ()-> {
            collection.addAll(Arrays.asList(1,2,3,9));
        });

        var thread2 = new Thread( ()-> {
            collection.addAll(Arrays.asList(4,5,6,7));
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(collection);
    }
}
