package jan2024.patterns.abstractFactory.txn;

public class CassandraTxn implements Transaction {

    String txn;

    @Override
    public String getTxn() {
        return txn;
    }

    @Override
    public void setTxn(String txn) {
        this.txn = txn;
        System.out.println(this.txn);
    }
}
