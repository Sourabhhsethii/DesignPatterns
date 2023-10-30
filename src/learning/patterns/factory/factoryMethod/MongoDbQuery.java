package learning.patterns.factory.factoryMethod;

public class MongoDbQuery implements Query {
    @Override
    public void getQuery() {
        System.out.println("MongoDbQuery");
    }
}
