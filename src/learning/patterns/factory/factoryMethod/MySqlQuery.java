package learning.patterns.factory.factoryMethod;

public class MySqlQuery implements Query{
    @Override
    public void getQuery() {
        System.out.println("MySqlQuery");
    }
}
