package jan2024.patterns.methodFactory;

import jan2024.patterns.methodFactory.database.Database;
import jan2024.patterns.methodFactory.database.MongoDb;
import jan2024.patterns.methodFactory.database.MySqlDB;

public class Main {
    public static void main(String[] args) {
        Database database = new MongoDb();

        /**
         * Associated query object with Mongodb;;;;
         */
        var query =database.getQueryObject();
        query.setQuery(" : get Documents from user collection :");
        query.getResult();

        /**
         *
         */
        Database database1 = new MySqlDB();

        /**
         * Associated query object with MySqlSb;;;;
         */
        var query2 = database1.getQueryObject();
        query2.setQuery("Select * from table;");
        query2.getResult();

    }
}
