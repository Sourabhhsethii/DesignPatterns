package com.dxsys.code.mosh.advance.streams;

import java.util.List;

public class SilcingStreamsDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

        // Difference between takewhile, dropwhile & filter.
        // Filter will filter entore stream whereas
        // takewhile will stop executing as soon as perdicate match.
        // DropWhile is oppsite of takewhile.

       /* movies.stream()
                .takeWhile(movie -> movie.getLikes() <30)
                .forEach(m -> System.out.println(m.getTitle()));*/


        //  1000 movie
        //  10 Movies oer page
        // 3rd Page
        // skip(20) = skip ( (page -1) * page Size)
        // limt(10) = limit(pageSize);

        /* movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getTitle())); */
    }
}
