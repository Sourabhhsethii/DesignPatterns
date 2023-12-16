package dec2023.patterns.bridge;

public class TextMessage extends Message{

    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
       messageSender.sendMessage();
    }
}
