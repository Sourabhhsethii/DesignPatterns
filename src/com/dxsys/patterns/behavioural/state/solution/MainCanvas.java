package com.dxsys.patterns.behavioural.state.solution;

import com.dxsys.patterns.behavioural.state.question.Canvas;

/**
 * Open Closed Principle
 *
 * Open for extension
 *
 * Closed for Modification
 */
public class MainCanvas {
    public static void main(String[] args){
        var canvas = new Canvas();
        canvas.setCurrentTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
