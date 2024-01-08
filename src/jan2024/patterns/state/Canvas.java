package jan2024.patterns.state;

public class Canvas {

    /**
     * State of the Canvas!!!
     */
    private ToolType currentTool;

    /**
     * Lot of if else conditions.
     * Violation of OCP.
     * Not Maintainable
     * Lack of extendability
     */
    public void mouseDown() {
        if(currentTool == ToolType.SELECTION){
            System.out.println("Selection Icon");
        } else if(currentTool == ToolType.BRUSH){
            System.out.println("Brush Icon");
        }  else if(currentTool == ToolType.ERASER){
            System.out.println("Eraser Icon");
        }
    }

    public void mouseUp(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Dashed Rect");
        } else if(currentTool == ToolType.BRUSH){
            System.out.println("Draw a line");
        }  else if(currentTool == ToolType.ERASER){
            System.out.println("Eraser Something");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
