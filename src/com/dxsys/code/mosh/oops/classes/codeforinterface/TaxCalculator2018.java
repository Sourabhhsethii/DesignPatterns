package com.dxsys.code.mosh.oops.classes.codeforinterface;

public class TaxCalculator2018 extends AbstactTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        return taxableIncome * 0.3;
    }

}
