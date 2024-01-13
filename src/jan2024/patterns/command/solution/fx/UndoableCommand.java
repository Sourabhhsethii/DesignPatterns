package jan2024.patterns.command.solution.fx;

public interface UndoableCommand extends Command{
    void unexecute();
}
