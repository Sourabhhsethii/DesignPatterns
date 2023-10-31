package learning.patterns.factory.abstractFactory;

public class PostgresFactory implements DatabaseFactory {
    @Override
    public void createQuery() {
        System.out.println(" creating Postgre Query Object");
    }

    @Override
    public void createTxn() {
        System.out.println(" creating Postgre Txn Object");
    }

    @Override
    public void createUpdate() {
        System.out.println(" creating Postgre Update Object");
    }
}
