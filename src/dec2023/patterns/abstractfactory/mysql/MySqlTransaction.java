package dec2023.patterns.abstractfactory.mysql;

import dec2023.patterns.abstractfactory.Transaction;

public class MySqlTransaction implements Transaction {
    @Override
    public void setTxn() {
        System.out.println("MySqlTransaction Set!!");
    }
}
