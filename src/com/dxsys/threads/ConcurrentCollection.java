package com.dxsys.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection {

    public static void main(String[] args) {
        Map<Integer,String > hashmap = new ConcurrentHashMap<>();
        hashmap.put(1,"a");
        hashmap.get(1);
        System.out.println(hashmap.toString());
        hashmap.remove(1);
        System.out.println(hashmap.toString());
    }
}
