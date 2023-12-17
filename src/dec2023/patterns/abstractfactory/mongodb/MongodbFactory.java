package dec2023.patterns.abstractfactory.mongodb;

import dec2023.patterns.abstractfactory.DatabaseFactory;
import dec2023.patterns.abstractfactory.Query;
import dec2023.patterns.abstractfactory.Transaction;

public class MongodbFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new MongoDbQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MongoDbTransaction();
    }
}
