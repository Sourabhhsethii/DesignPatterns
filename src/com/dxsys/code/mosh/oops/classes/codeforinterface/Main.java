package com.dxsys.code.mosh.oops.classes.codeforinterface;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_00);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2019());
    }
}
