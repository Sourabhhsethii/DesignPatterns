package jan2024.patterns.command.solution.editor;

public class HTMLDoc {
    private String content;

    public  void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
