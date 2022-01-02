package com.dxsys.code.mosh.advance.streams;

import java.util.List;

public class StreamsDemo {

    public static void main(String[] args) {

        CreatingStreamsDemo.show();;
        System.out.println();

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );


        // Imperative Programming | Procedural - How something should be done?
        int count = 10;
        for(var movie : movies){
            if(movie.getLikes() > 10)
                count++;
        }

        // With Stream we can process a collection with functional way.
        // Declarative (Functional) Programming. - What needs to be done?
        var count2 =movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .count();

        System.out.println(count2);


    }

    // Programming Paradigms.
    /**
     * Imperative - Procedural (Instructions - How Part? )
     * Declarative - SQL - What data need to get from database. There is no provide How it will done?
     * Functional  - It is special type of Declarative Programming. have additinal parameter
     * Object-Orinted
     * Event-Driven
     */
}
