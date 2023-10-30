package learning.patterns.factory.factoryMethod;

public class MySql implements Database {

    MySqlQuery mySqlQuery;

    @Override
    public void connection() {
        System.out.println("Lets start with  MySql connection");
    }

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
