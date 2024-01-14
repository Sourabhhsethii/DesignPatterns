package jan2024.patterns.templateMethod;

import assignment.Solution;

public abstract class DbTemplate {

    public void getQuery(){
     getConnection();
     getTxn();
     executeQuery();
     closeTxn();
     closeConnect();
    }

    private void getConnection() {
        System.out.println("get Connect");
    }

    private void getTxn() {
        System.out.println("getting connect");
    }

    protected abstract void executeQuery();

    private void closeConnect(){
        System.out.println("Closing the connection");
    }

    private void closeTxn()
    {
        System.out.println("Close connection");

    }

}
