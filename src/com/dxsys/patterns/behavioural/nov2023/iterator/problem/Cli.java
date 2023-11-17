package com.dxsys.patterns.behavioural.nov2023.iterator.problem;

public class Cli {

    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        /**
         * Breaked!!! if the implementation from ArrayList changed to Array[]
         */
        for (int i = 0; i < history.getUrls().size(); i++) {
            var str = history.getUrls().get(i);
            System.out.println(str);
        }

    }
}
