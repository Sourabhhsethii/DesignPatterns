package com.dxsys.code.mosh.advance.streams;

import java.util.Comparator;
import java.util.List;

public class Reducer {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

        var result = movies.stream()
                .anyMatch(m -> m.getLikes() >20);

        System.out.println(result);

        var result2 = movies.stream()
                .noneMatch(m -> m.getLikes() >20);

        System.out.println(result2);

        var findFirstMoview = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();

        System.out.println(findFirstMoview.getTitle());
    }
}
