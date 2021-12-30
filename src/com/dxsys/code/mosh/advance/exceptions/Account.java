package com.dxsys.code.mosh.advance.exceptions;

import java.io.IOException;

public class Account {

    private float balance;

    public void deposit(float value) throws IOException {

        if(value <=0)
            throw new IOException();
    }

    public  void withDraw(float value) throws AccountExcpetion {
        if(value > balance ) {
            var accountException = new AccountExcpetion(new InsufficientFundsException());
            throw accountException;
        }
    }
}
