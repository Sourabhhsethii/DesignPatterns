package jan2024.patterns.command.solution.app;

import jan2024.patterns.command.solution.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
