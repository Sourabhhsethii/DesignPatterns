package learning.patterns.factory.factoryMethod;

public class PostgresQuery implements Query{

    @Override
    public void getQuery() {
        System.out.println("PostgresQuery");
    }
}
