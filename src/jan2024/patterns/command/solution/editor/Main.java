package jan2024.patterns.command.solution.editor;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HTMLDoc();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());
        boldCommand.unexecute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
