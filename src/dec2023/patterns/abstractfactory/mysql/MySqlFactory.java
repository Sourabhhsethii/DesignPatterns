package dec2023.patterns.abstractfactory.mysql;

import dec2023.patterns.abstractfactory.DatabaseFactory;
import dec2023.patterns.abstractfactory.Query;
import dec2023.patterns.abstractfactory.Transaction;

public class MySqlFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }
}
