package com.dxsys.code.mosh.advance.genrics.problem;

import java.util.Objects;

public class List {



    private int capacity;
    private Object[] items;
    private int count;

    public List(int capacity) {
        this.capacity = capacity;
        items = new Object[capacity];
    }

    public void add(Object item) {
        items[count++] = item;
    }

    public Object get(int index){
        return items[index];
    }

    public Object[] get(){
        return items;
    }
}
