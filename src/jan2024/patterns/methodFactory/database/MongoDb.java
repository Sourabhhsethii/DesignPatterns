package jan2024.patterns.methodFactory.database;

import jan2024.patterns.methodFactory.query.MongoDbQuery;
import jan2024.patterns.methodFactory.query.Query;

public class MongoDb extends Database {
    @Override
    public Query getQueryObject() {
        return new MongoDbQuery();
    }
}
