package learning.patterns.factory.abstractFactory;

public class MongoDbFactory implements DatabaseFactory {
    @Override
    public void createQuery() {
        System.out.println(" creating Mongo Query Object");
    }

    @Override
    public void createTxn() {
        System.out.println(" creating Mongo Txn Object");
    }

    @Override
    public void createUpdate() {
        System.out.println(" creating Mongo Update Object");
    }
}
