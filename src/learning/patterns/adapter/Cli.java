package learning.patterns.adapter;

public class Cli {
    public static void main(String[] args) {

        // Dependency Injection
        Client client = new Client(new IciciBankAdapter());
        client.pay();
        client.checkBalance();
    }
}
