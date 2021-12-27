package com.dxsys.code.mosh.oops.classes.codeforinterface;

public abstract class AbstactTaxCalculator implements TaxCalculator {

    protected double getTaxabaleIncome(double income, double expenses){
        return income - expenses;
    }
}
