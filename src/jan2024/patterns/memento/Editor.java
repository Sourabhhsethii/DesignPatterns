package jan2024.patterns.memento;

/**
 * Store content & undo it as well.
 */
public class Editor {

    private String content;
    private String title;
    private String colour;
    private String font;

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getColour() {
        return colour;
    }

    public String getFont() {
        return font;
    }

    public EditorState createState() {
       return new EditorState(content,title,colour,font);
    }

    public void restoreState(EditorState editorState) {
        this.content = editorState.getContent();
        this.title = editorState.getTitle();
        this.colour = editorState.getColour();
        this.font = editorState.getFont();
    }
}
