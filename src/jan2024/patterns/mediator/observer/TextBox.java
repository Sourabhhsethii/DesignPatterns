package jan2024.patterns.mediator.observer;

public class TextBox extends UiControl{

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyHandler();
    }
}
