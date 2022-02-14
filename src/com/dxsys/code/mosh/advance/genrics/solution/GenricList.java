package com.dxsys.code.mosh.advance.genrics.solution;

import java.util.Iterator;

public class GenricList<T> implements Iterable{

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{
        private GenricList<T> list;
        private int index;

        public ListIterator(GenricList<T> list){
            this.list = list;
        }


        @Override
        public boolean hasNext() {
            return (index <list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
