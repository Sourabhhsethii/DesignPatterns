package learning.patterns.factory.abstractFactory;

public class MongoDatabase extends Database {


    @Override
    public DatabaseFactory createFactory() {
        return new MongoDbFactory() ;
    }
}
