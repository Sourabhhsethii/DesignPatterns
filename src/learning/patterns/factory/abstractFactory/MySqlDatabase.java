package learning.patterns.factory.abstractFactory;

import javax.management.Query;

public class MySqlDatabase extends Database{


    @Override
    public DatabaseFactory createFactory() {
        return new MysqlDbFactory() ;
    }
}
