package com.dxsys.code.mosh.advance.streams;

import java.util.List;
import java.util.Optional;

public class GenralPursposeRductionOpns {


    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // [10,20,30]
        // [30, 30]
        // [60]

        Optional<Integer> sum = movies.stream()
                .map(m -> m.getLikes())
                .reduce((a,b)-> a +b);

        System.out.println(sum.orElse(0));


    }

}
