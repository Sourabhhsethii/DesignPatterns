package com.dxsys.code.mosh.basic;

import java.util.Scanner;

public class ControlFlowMain {

    public static void main(String[] args) {

        System.out.println(" ************* Comparision Operators *************");
        // Comparision Operators
        int x =1;
        int y =1;
        System.out.println(x == y); // Equality Operator (==) & it is boolean expression | Equality Operator(!=)
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        System.out.println("************* Logical Operators *************");

        // Logical Operators
        int temperature = 12;
        boolean isWarm = temperature>20 && temperature<30; // And
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord; // OR
        System.out.println(isEligible);

        // if Statements
        System.out.println(" ************* if statements *************");
        int temp = 32;
        if(temp>30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if(temp>20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold Day");

        System.out.println("************* Simplify if Statement *************");

        int income = 120_000;
        boolean hasHighIncomeCheck = (income > 100_000);

        System.out.println("************* The Ternary Operator *************");
        String className = (income>100_00)? "First" : "Economy";
        System.out.println(className);

        System.out.println("************* Switched Statements *************");
        int role = 1;

        switch (role){
            case 0 :
                System.out.println("You are an admin");
                break;
            case 1 :
                System.out.println(" You are a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number :");
        int number = scanner.nextInt();

        if(number % 5 == 0) {
            if(number % 3 ==0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } if(number %3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        // Loops ---
        System.out.println("************* For Loops *************");
        for(int i=0; i <5;i++){
            System.out.println("Hello world " + i);
        }

        System.out.println("************* For Loops Reverse *************");
        for(int i=5; i >0;i--){
            System.out.println("Hello world " + i);
        }

        System.out.println("************* While Loops *************");

    }
}
