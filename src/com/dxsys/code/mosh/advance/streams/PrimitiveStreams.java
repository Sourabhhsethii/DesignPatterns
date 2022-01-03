package com.dxsys.code.mosh.advance.streams;

import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        IntStream.range(1,5)
                .forEach(System.out::println);
    }
}
