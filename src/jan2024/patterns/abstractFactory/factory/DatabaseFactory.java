package jan2024.patterns.abstractFactory.factory;

import jan2024.patterns.abstractFactory.query.Query;
import jan2024.patterns.abstractFactory.txn.Transaction;

public interface DatabaseFactory {
   Query getQuery();
   Transaction getTxn();
}
