package jan2024.patterns.command.solution.app;

import jan2024.patterns.command.solution.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black & White Interface");
    }
}
