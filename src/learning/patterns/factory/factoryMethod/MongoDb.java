package learning.patterns.factory.factoryMethod;

public class MongoDb implements Database{

    MongoDbQuery mongoDbQuery;

    @Override
    public void connection() {
        System.out.println("Lets start with  MongoDb connection");
    }

    @Override
    public Query createQuery() {
        return  new MongoDbQuery();
    }
}
