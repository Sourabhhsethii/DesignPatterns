package jan2024.patterns.methodFactory.query;

public class MongoDbQuery implements Query {

    String query;

    @Override
    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public void getResult() {
        System.out.println("getting result from: ->"+ query);
    }
}
