package dec2023.patterns.bridge;

public class EmailMessage extends Message{

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
     messageSender.sendMessage();
    }
}
