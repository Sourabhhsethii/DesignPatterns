package jan2024.patterns.mediator.observer;

public class Button  extends UiControl{
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyHandler();
    }
}
