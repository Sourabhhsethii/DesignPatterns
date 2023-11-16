package com.dxsys.patterns.behavioural.nov2023.state.solution;

public class Canvas {
    private Tool tool;

    public void mouseDown(){

        tool.mouseDown();

    }
    public void mouseUp(){
        tool.mouseUp();
    }
    public Tool getCurrentTool(){
        return tool;
    }

    public void setTool(Tool tool){
        this.tool = tool;
    }
}
