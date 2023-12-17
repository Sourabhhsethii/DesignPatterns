package dec2023.patterns.factoryMethod.mongodb;

import dec2023.patterns.factoryMethod.Transaction;

public class MongoDbTransaction implements Transaction {
    @Override
    public void setTxn() {
        System.out.println("MongoDB Txn is set!!!");
    }
}
