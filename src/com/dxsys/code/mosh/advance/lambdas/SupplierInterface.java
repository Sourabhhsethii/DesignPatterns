package com.dxsys.code.mosh.advance.lambdas;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        DoubleSupplier getRandom = ()-> Math.random();
        var random = getRandom.getAsDouble();
        System.out.println(random);
    }
}
