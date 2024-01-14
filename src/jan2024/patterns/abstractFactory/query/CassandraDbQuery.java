package jan2024.patterns.abstractFactory.query;

public class CassandraDbQuery implements Query {

    private String query;

    @Override
    public String getQuery() {
        return query;
    }

    @Override
    public void setQuery(String query) {
        this.query = query;
        System.out.println(query);
    }
}
