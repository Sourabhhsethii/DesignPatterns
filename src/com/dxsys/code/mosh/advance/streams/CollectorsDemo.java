package com.dxsys.code.mosh.advance.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {



    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("d", 10),
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

        // Key (title)
        // value (likes)

       var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(m -> m.getLikes()));

        System.out.println(result);

        var result2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));

        System.out.println(result2);
    }
}
