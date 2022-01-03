package com.dxsys.code.mosh.advance.streams;

import java.util.List;

public class PeekingElements {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println( "filtered: " + m.getTitle()))
                .map(m -> m.getTitle())
                .peek(t -> System.out.println("mapped " + t))
                .forEach(System.out::println);
    }
}
