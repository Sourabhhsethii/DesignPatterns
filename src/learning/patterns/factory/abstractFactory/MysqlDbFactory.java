package learning.patterns.factory.abstractFactory;

public class MysqlDbFactory implements DatabaseFactory {
    @Override
    public void createQuery() {
        System.out.println(" creating MySql Query Object");
    }

    @Override
    public void createTxn() {
        System.out.println(" creating MySql Txn Object");
    }

    @Override
    public void createUpdate() {
        System.out.println(" creating MySql Update Object");
    }
}
