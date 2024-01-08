package jan2024.patterns.state.solution;

public class BrushTool implements Tool {


    @Override
    public void mouseUp() {
        System.out.println("Brush Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
