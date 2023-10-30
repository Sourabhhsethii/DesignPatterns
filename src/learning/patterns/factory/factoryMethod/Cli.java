package learning.patterns.factory.factoryMethod;

public class Cli {
    public static void main(String[] args) {
        Database db = new MySql();
        db.connection();
        Query q = db.createQuery();
        q.getQuery();


        db = new Postgres();
        db.connection();
        q = db.createQuery();
        q.getQuery();

        db = new MongoDb();
        db.connection();
        q = db.createQuery();
        q.getQuery();
    }
}
