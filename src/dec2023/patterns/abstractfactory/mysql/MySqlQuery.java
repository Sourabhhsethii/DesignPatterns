package dec2023.patterns.abstractfactory.mysql;

import dec2023.patterns.abstractfactory.Query;

public class MySqlQuery implements Query {
    @Override
    public void setQuery() {
        System.out.println("MySqlQuery Set!!!");
    }
}
