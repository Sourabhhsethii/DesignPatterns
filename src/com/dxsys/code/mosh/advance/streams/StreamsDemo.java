package com.dxsys.code.mosh.advance.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {

        // CreatingStreamsDemo.show();;
        System.out.println();

        var stream =Stream.of(List.of(1,2,3),List.of(4,5,6));
           // stream.forEach(list-> System.out.println(list));

        // Flaten the list of stream to objects;
        // Stream<List<x>> -> Stream<x>
        stream.
                flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));

     /*   List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );*/

      /*  movies.stream()
                .map(movie ->  movie.getTitle())
                .forEach(name -> System.out.println(name));*/


        // Imperative Programming | Procedural - How something should be done?
        int count = 10;
      /*  for(var movie : movies){
            if(movie.getLikes() > 10)
                count++;
        }*/

        // With Stream we can process a collection with functional way.
        // Declarative (Functional) Programming. - What needs to be done?
       /* var count2 =movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .count();

        System.out.println(count2);*/



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
