package june2024.patterns.bhevarial.interfaceproxy;

public class Client {
    public static void main(String[] args) {
        Box box = new BoxProxy();
        box.colour(1);
    }
}
