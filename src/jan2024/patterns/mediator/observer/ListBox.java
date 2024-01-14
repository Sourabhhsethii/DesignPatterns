package jan2024.patterns.mediator.observer;

public class ListBox extends UiControl {
    public String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyHandler();
    }
}
