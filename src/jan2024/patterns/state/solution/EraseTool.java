package jan2024.patterns.state.solution;

public class EraseTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Erase Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase Line");
    }
}
