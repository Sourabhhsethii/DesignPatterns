package dec2023.patterns.factoryMethod;

import dec2023.patterns.factoryMethod.Database;
import dec2023.patterns.factoryMethod.Query;
import dec2023.patterns.factoryMethod.Transaction;
import dec2023.patterns.factoryMethod.mongodb.MongoDbQuery;
import dec2023.patterns.factoryMethod.mongodb.MongoDbTransaction;

public class MongoDb extends Database {

    @Override
    public Query createQuery() {
        return new MongoDbQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MongoDbTransaction();
    }
}
