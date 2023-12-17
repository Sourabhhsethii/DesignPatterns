package dec2023.patterns.abstractfactory.mongodb;

import dec2023.patterns.abstractfactory.Transaction;

public class MongoDbTransaction implements Transaction {
    @Override
    public void setTxn() {
        System.out.println("MongoDB Txn is set!!!");
    }
}
