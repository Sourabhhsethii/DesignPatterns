package learning.patterns.basics.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        /**
         * Form Collections
         * From Arrays
         * From an arbitrary number of objects
         * Infinite/Finite Streams
         */

        Collection<Integer> x = List.of(1,2,3);
        x.stream();

        var list = new ArrayList<>();
        list.stream();

        int[] number = {1,2,3};
       var stream = Arrays.stream(number);
       stream.forEach(i-> System.out.println(i));

        var randomStream = Stream.generate(()-> Math.random());
       randomStream.limit(4).forEach(System.out::println);

       var str = Stream.iterate(1,n-> n+1);
       str.limit(10).forEach(System.out::println);


    }
}
