package com.dxsys.code.mosh.advance.exceptions;


import java.io.IOException;

import static com.dxsys.code.mosh.advance.exceptions.ExceptionsDemo.show;

public class Main {

    public static void main(String[] args) throws IOException {
        var account = new Account();
        try {
            account.withDraw(10);
        } catch (AccountExcpetion e) {
            e.printStackTrace();
        }
        account.deposit(1);
        show();
    }
}
