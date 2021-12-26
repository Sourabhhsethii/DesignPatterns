package com.dxsys.code.mosh.refactoring.post;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balanace: calculator.getRemainingBalances()){
            System.out.println(NumberFormat.getCurrencyInstance().format(balanace));
        }
    }

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
