package com.dxsys.patterns.behavioural.nov2023.state.problem;

/**
 * How you will solve the below example!!!
 * Think Think Think???
 * It is Voilation of SRP & OCP!!
 */
public class Canvas {
    public ToolType getToolType() {
        return toolType;
    }

    public void setToolType(ToolType toolType) {
        this.toolType = toolType;
    }

    private ToolType toolType;

    /**
     * We need to cpy paste & Its not extensible
     * All the decisions  making has to be copy, lets say in next keyboard icons.
     */
    public void mouseDown(){

        if(toolType == ToolType.SELECTION){
            System.out.println("Selection Icon");
        } else if(toolType == ToolType.BRUSH) {
            System.out.println("Selection Icon");
        }else if(toolType == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        }

    }

    /**
     * We need to cpy paste & Its not extensible
     */
    public void mouseUp(){
        if(toolType == ToolType.SELECTION){
            System.out.println("Draw dashed rectangle");
        } else if(toolType == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        }else if(toolType == ToolType.BRUSH) {
            System.out.println("Erasers Icon");
        }

    }
}
