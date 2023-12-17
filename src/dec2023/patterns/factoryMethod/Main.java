package dec2023.patterns.factoryMethod;

public class Main {

    public static void main(String[] args) {
        Database database = new MongoDb();
        database.setDriver("org.mongodb.files");
        database.setUrl("mondodb://sethi1");

        database.createTransaction().setTxn();
        database.createQuery().setQuery();

    }
}
