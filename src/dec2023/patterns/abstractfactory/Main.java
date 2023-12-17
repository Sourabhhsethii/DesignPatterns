package dec2023.patterns.abstractfactory;

public class Main {

    public static void main(String[] args) {
        Database database = new MongoDb();
        database.setDriver("org.mongodb.files");
        database.setUrl("mondodb://sethi1");


        database.createFactory().createTransaction().setTxn();
        database.createFactory().createQuery().setQuery();

        Database database1 = new MySqlDb();
        database1.setDriver("org.mysql.files");
        database1.setUrl("mysql://sethi1");


        database1.createFactory().createTransaction().setTxn();
        database1.createFactory().createQuery().setQuery();


    }
}
