package dec2023.patterns.bridge;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage(new TextMessageSender());
        message.send();

        message = new EmailMessage(new EmailMessageSender());
        message.send();
    }
}
