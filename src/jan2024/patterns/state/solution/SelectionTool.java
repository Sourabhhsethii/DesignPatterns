package jan2024.patterns.state.solution;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a bashed rectangle");
    }
}
