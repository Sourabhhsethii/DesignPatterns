package jan2024.patterns.command.solution.app;

import jan2024.patterns.command.solution.fx.Command;

import java.net.CookieManager;
import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }
    @Override
    public void execute() {
        for (var command: commands){
            command.execute();;
        }
    }
}
