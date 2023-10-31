package learning.patterns.factory.abstractFactory;

import javax.management.Query;

public class PostgresDatabase extends Database {


    @Override
    public DatabaseFactory createFactory() {
        return  new PostgresFactory()  ;
    }

}
