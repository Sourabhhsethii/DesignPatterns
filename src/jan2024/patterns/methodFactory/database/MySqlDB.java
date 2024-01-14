package jan2024.patterns.methodFactory.database;

import jan2024.patterns.methodFactory.query.MySqlDbQuery;
import jan2024.patterns.methodFactory.query.Query;

public class MySqlDB extends Database {
    @Override
    public Query getQueryObject() {
        return new MySqlDbQuery();
    }
}
