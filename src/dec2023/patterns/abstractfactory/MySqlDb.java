package dec2023.patterns.abstractfactory;

import dec2023.patterns.abstractfactory.mysql.MySqlFactory;

public class MySqlDb extends Database{
    @Override
    public DatabaseFactory createFactory() {
        return new MySqlFactory();
    }
}
