package dec2023.patterns.factoryMethod.mongodb;

import dec2023.patterns.factoryMethod.Query;

public class MongoDbQuery implements Query {

    @Override
    public void setQuery() {
        System.out.println("MongoDb Query is set");
    }
}
