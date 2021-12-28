package com.dxsys.code.mosh.basic;

public class ControlFlowMain {

    public static void main(String[] args) {

        System.out.println("Comparision Operators");
        // Comparision Operators
        int x =1;
        int y =1;
        System.out.println(x == y); // Equality Operator (==) & it is boolean expression | Equality Operator(!=)
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        System.out.println("Logical Operators");

        // Logical Operators
        int temperature = 12;
        boolean isWarm = temperature>20 && temperature<30; // And
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord; // OR
        System.out.println(isEligible);

    }
}
