package dec2023.patterns.abstractfactory;

import dec2023.patterns.abstractfactory.mongodb.MongoDbQuery;
import dec2023.patterns.abstractfactory.mongodb.MongoDbTransaction;
import dec2023.patterns.abstractfactory.mongodb.MongodbFactory;

public class MongoDb extends Database {

    @Override
    public DatabaseFactory createFactory() {
        return new MongodbFactory();
    }
}
