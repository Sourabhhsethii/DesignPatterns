package dec2023.patterns.bridge;

public class TextMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("Message Sent VIA SMS");
    }
}
