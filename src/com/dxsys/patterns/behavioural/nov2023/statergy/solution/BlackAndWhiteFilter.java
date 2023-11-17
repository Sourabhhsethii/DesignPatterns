package com.dxsys.patterns.behavioural.nov2023.statergy.solution;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Filter using BlackAnfWhiteFilter to " + fileName);
    }
}
