package com.dxsys.code.mosh.basic;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class TypesMain {

    public static void main(String[] args) {

        // Primitive Types
        byte myAge = 31;
        int herAge = myAge;
        long viewCounts = 3_123_456_789_1l;
        System.out.println("ViewCounts " + viewCounts);
        float price = 10.99f; // By Default java treat decimal number as double to make it float, need to used f in end.
        char letter ='A';
        boolean isEligile = false;

        // Primitive Types
        byte age = 30;


        // Reference Type
        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        // c:\Windows\...
        String drive = "c:\\Windows\\..";
        String newline ="C drive \n Windows \t";
        String message = " Hello \"World\"" + "!! ";
        System.out.println(message.length());
        System.out.println(message.replace("!","**"));
        System.out.println(message);
        System.out.println(message.trim());

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        int[] num = {1,2,3,4,5};


        System.out.println(num.length);
        System.out.println( Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(numbers);
        // numbers[10] = 3;

        int[][][] multiDimarray =  new int[2][3][8];
        multiDimarray[0][0][0] = 1;
        System.out.println(Arrays.deepToString(multiDimarray));

        final float PI = 3.14f; // Constant

        float result = (float) 10f / (float) 3f;
        System.out.println(result);

        int xinc = 1;
        int yinc = xinc++;
        System.out.println(xinc);
        System.out.println(yinc);

        // Implicit casting.
        // byte > short > int > long > float > double
        double abc =1.1;

        // Explicit casting. only happens with compatiable with each other.
        int def = (int) abc+2; //2.0
        System.out.println(def);

        // Using Wrapper classes to parse string into number/decimal
        String xx = "1.1";
        double yy = Double.parseDouble(xx) +2;
        System.out.println(yy);

        System.out.println("------------MathsClass--------------");
        int result2 = Math.round(1.1f);
        System.out.println(result2);

        int result3 = (int)Math.floor(1.1f);
        System.out.println(result3);

        int greater = Math.max(1,2);
        System.out.println(greater);

        int random = (int)(Math.random() * 100);
        System.out.println(random);

        System.out.println("------------NumberFormat--------------");

        // NumberFormat currency = new NumberFormat(); NumberFormat is abstract classes.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(12456865.691));

        String resultpercent = NumberFormat.getPercentInstance().format(5);
        System.out.println(resultpercent);

        System.out.println("------------NumberFormat--------------");
        System.out.print("----Input--------Age:");
        Scanner scanner = new Scanner(System.in);
        byte agelookup = scanner.nextByte();
        System.out.println("you are " + agelookup);
    }
}
