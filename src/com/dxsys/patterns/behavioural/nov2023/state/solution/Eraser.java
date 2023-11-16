package com.dxsys.patterns.behavioural.nov2023.state.solution;

public class Eraser implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Erase it.");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }
}
