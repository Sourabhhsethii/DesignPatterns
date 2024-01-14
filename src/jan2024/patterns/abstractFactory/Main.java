package jan2024.patterns.abstractFactory;

import jan2024.patterns.abstractFactory.db.CassandraDb;
import jan2024.patterns.abstractFactory.db.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new CassandraDb();
        var casandraDbQuery = db.getdbFactory().getQuery();
        casandraDbQuery.setQuery("casandraDb db query is set");
        System.out.println(casandraDbQuery.getQuery());

        var casandraDbTxn = db.getdbFactory().getTxn();
        casandraDbTxn.setTxn("casandraDb db txn is set");
        System.out.println(casandraDbTxn.getTxn());

    }
}
