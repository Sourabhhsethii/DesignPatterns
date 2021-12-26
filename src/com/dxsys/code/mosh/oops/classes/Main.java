package com.dxsys.code.mosh.oops.classes;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {

        /* var textBox = new TextBox();
        textBox.setTex("Box 1");

        System.out.println(textBox.text.toUpperCase());
        textBox.clear();
        System.out.println(textBox.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setTex("Box 2");

        System.out.println(textBox2.text.toUpperCase());*/



/*        var textBox1 = new TextBox();
        var textBox2 = textBox1;
            textBox2.setTex("Hello World");
        System.out.println(textBox2.text);*/


        // procedural Programming Example - This will end up with fat main class and not maintainable.

       /* int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary,extraHours,hourlyRate);

        System.out.println(wage);*/


        // Easy to maintainable, reusable using encapsulation
        var employee = new Employee();
        employee.setBaseSalary(500);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }

    // procedural Programming Example
    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
    return baseSalary + (extraHours * hourlyRate);
    }
}
