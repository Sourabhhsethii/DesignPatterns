package dec2023.patterns.bridge;

// Bridge between abstract class & interface via association.
public abstract class Message {
    MessageSender messageSender;
    public abstract void send();

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
