package jan2024.patterns.state.solution;

/**
 * Open Close Principle
 */
public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        /**
         * Dependency Injection
         */
        canvas.setCurrentTool(new SelectionTool());

        canvas.mouseUp();
        canvas.mouseDown();

        /**
         * Dependency Injection
         */
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(new EraseTool());

        canvas.mouseUp();
        canvas.mouseDown();

    }
}
