package com.dxsys.code.mosh.advance.streams;

import java.util.List;
import java.util.function.Predicate;

public class FilterStreamDemo {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        Predicate<Movie> isPopular = m -> m.getLikes() >10;
        movies.stream()
                .filter(isPopular)
                .forEach(m-> System.out.println(m.getTitle()));
    }
}
