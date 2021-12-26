package com.dxsys.patterns.behavioural.state.solution;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush  Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
