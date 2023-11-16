package com.dxsys.patterns.behavioural.nov2023.state.solution;

public class Selection implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }
}
