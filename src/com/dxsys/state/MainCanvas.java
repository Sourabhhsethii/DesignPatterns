package com.dxsys.state;

public class MainCanvas {

    private ToolType currentTool;

    public void mouseDown(){

        if(currentTool ==  ToolType.SELECTION){
            System.out.println("Selection Icon");
        } else if(currentTool ==  ToolType.BRUSH){
            System.out.println("BRUSH Icon");
        } else if(currentTool == ToolType.ERASER){
            System.out.println("ERASER Icon");
        }

    }

    public void mouseUp(){


        if(currentTool ==  ToolType.SELECTION){
            System.out.println("Draw dashed line");
        } else if(currentTool ==  ToolType.BRUSH){
            System.out.println("Draw a line");
        } else if(currentTool == ToolType.ERASER){
            System.out.println("ERASER Something");
        }

    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
