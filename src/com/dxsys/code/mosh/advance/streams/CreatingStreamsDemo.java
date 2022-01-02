package com.dxsys.code.mosh.advance.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){

        // Way 1
        /*int[] numbers ={1,2,3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));*/


        // Way 2 - Infinte Streams
     /*  var stream = Stream.generate(()-> Math.random());
        stream
                .limit(3)
                .forEach(n-> System.out.println(n));*/

        // Way 3 - Iterate
        Stream.iterate(1,n -> n+1)
                .limit(10)
                .forEach(n -> System.out.println(n));
    }
}
