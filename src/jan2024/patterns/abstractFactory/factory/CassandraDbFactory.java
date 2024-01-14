package jan2024.patterns.abstractFactory.factory;

import jan2024.patterns.abstractFactory.query.CassandraDbQuery;
import jan2024.patterns.abstractFactory.query.Query;
import jan2024.patterns.abstractFactory.txn.CassandraTxn;
import jan2024.patterns.abstractFactory.txn.Transaction;

public class CassandraDbFactory implements DatabaseFactory {

    @Override
    public Query getQuery() {
        return new CassandraDbQuery();
    }

    @Override
    public Transaction getTxn() {
        return new CassandraTxn();
    }
}
