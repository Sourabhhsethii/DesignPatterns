package com.dxsys.patterns.behavioural.nov2023.iterator.solution;

interface Iterator<T> {
    boolean hasNext();
    void next();
    T current();
}

// implements Iterator<String>
// implements Iterator<User>