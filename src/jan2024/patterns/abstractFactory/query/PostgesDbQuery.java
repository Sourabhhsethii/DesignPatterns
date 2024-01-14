package jan2024.patterns.abstractFactory.query;

import jan2024.patterns.abstractFactory.db.PostgresDb;

public class PostgesDbQuery implements Query {

    private String query;

    @Override
    public String getQuery() {
        return query;
    }

    @Override
    public void setQuery(String txn) {
        this.query = query;
        System.out.println(txn);
    }
}
