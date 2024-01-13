package jan2024.patterns.command.solution.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
