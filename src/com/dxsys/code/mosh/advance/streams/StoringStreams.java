package com.dxsys.code.mosh.advance.streams;

import java.util.Comparator;
import java.util.List;

public class StoringStreams {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("d", 10),
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

        // For Compare & Revered
    /*    movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(m -> System.out.println(m.getTitle()));*/

        // Unique List of Values
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);
    }
}
