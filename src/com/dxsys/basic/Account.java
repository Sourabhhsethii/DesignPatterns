package com.dxsys.basic;

public class Account {
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void deposit(int ammount){
        if(ammount > 0)
        this.balance = this.balance + ammount;
    }

    public  void withDraw(float amount){
        if (amount > 0) {
            this.balance -= amount;
        }
    }

    public void setBalance(float balance) {
        if(balance>0){
            this.balance = balance;
        }
    }
}
