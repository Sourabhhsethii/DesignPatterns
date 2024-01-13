package jan2024.patterns.command.solution.editor;

public class BoldCommand implements  UndoableCommand{

    private String prevContent;
    private HTMLDoc doc;
    private History history;

    public BoldCommand(HTMLDoc doc, History history) {
        this.doc = doc;
        this.history = history;
    }

    @Override
    public void execute() {
    doc.setContent(prevContent);
    }

    @Override
    public void unexecute() {
        prevContent = doc.getContent();
        doc.makeBold();;
        history.push(this);
    }
}
