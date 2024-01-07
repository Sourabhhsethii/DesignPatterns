package jan2024.patterns.memento;

public class EditorState {

    private final String content;
    private final String title;
    private final String colour;
    private final String font;

    public EditorState(String content, String title, String colour, String font) {
        this.content = content;
        this.title = title;
        this.colour = colour;
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

}
