package dec2023.patterns.abstractfactory.mongodb;

import dec2023.patterns.abstractfactory.Query;

public class MongoDbQuery implements Query {

    @Override
    public void setQuery() {
        System.out.println("MongoDb Query is set");
    }
}
