package com.dxsys.patterns.behavioural.nov2023.state.solution;

public class Brush implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw line");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }
}
