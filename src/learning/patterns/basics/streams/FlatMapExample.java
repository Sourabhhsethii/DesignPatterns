package learning.patterns.basics.streams;

import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {

        var str2 = Stream.of(List.of(
                new Movie("Test1",10,Genre.THRILLER), new Movie("Test 2", 20, Genre.COMEDY)
        ),

                List.of("tes1", "Test2")
        );

        str2.flatMap(list-> list.stream()).forEach(System.out::println);
    }
}
