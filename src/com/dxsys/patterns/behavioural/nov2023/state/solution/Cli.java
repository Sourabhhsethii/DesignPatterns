package com.dxsys.patterns.behavioural.nov2023.state.solution;

/**
 * We have followed Open/Close Principle & Made our application Extensible & Robust..
 */
public class Cli {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        /**
         * Extended the code!!!
         */
        canvas.setTool(new Eraser());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
