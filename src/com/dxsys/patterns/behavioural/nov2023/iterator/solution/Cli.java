package com.dxsys.patterns.behavioural.nov2023.iterator.solution;

public class Cli {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            var str = iterator.current();
            System.out.println(str);
            iterator.next();
        }

    }
}
