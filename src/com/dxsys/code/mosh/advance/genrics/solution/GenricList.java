package com.dxsys.code.mosh.advance.genrics.solution;

public class GenricList<T extends Comparable> {

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }
}
