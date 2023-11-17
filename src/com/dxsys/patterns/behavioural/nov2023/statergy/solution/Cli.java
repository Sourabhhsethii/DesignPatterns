package com.dxsys.patterns.behavioural.nov2023.statergy.solution;

public class Cli {
    public static void main(String[] args) {
        var process = new ImageStorage(new JPegCompressor(),new BlackAndWhiteFilter());
        process.store("Test File");
    }
}
