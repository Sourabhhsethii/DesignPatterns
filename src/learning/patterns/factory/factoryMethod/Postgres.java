package learning.patterns.factory.factoryMethod;

public class Postgres implements Database{

    PostgresQuery postgresQuery;

    @Override
    public void connection() {
        System.out.println("Lets start with  Postgres connection");
    }

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}
