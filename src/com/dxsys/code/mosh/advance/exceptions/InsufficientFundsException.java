package com.dxsys.code.mosh.advance.exceptions;

// Checked -> Exception
// Unchecked (runtime) -> RuntimeException
public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message) {
        super(message);
    }
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }
}
