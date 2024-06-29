package june2024.patterns.bhevarial.proxy.classproxy;

public class Client {
    public static void main(String[] args) {
        BoxProxy boxProxy = new BoxProxy();
        boxProxy.colour(1,true);
    }
}
