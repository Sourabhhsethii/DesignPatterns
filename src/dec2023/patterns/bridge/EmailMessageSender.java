package dec2023.patterns.bridge;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Message sent VIA EmailMessageSender");
    }
}
