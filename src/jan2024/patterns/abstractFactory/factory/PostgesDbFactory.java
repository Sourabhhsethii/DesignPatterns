package jan2024.patterns.abstractFactory.factory;

import jan2024.patterns.abstractFactory.query.PostgesDbQuery;
import jan2024.patterns.abstractFactory.query.Query;
import jan2024.patterns.abstractFactory.txn.CassandraTxn;
import jan2024.patterns.abstractFactory.txn.Transaction;

public class PostgesDbFactory implements DatabaseFactory{
    @Override
    public Query getQuery() {
        return new PostgesDbQuery();
    }

    @Override
    public Transaction getTxn() {
        return new CassandraTxn();
    }
}
