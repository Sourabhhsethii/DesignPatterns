package learning.patterns.factory.abstractFactory;


public class Cli {
    public static void main(String[] args) {

       Database db = new MySqlDatabase();

        db.createFactory().createTxn();
        db.createFactory().createQuery();

        db = new MongoDatabase();
        db.createFactory().createTxn();
        db.createFactory().createQuery();

        db = new PostgresDatabase();
        db.createFactory().createTxn();
        db.createFactory().createQuery();

        //// Or Practical Factory //////

        DbPracticalFactory dbPracticalFactory = new DbPracticalFactory();
        db = dbPracticalFactory.getDbObject("mysql");
        db.createFactory().createTxn();
    }
}
