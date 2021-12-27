package com.dxsys.code.mosh.oops.classes;

import org.w3c.dom.Text;

import javax.swing.*;
import java.security.cert.PolicyNode;

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
        /*var employee = new Employee(50_000);
        int wage = employee.calculateWage(0);
        Employee.printNoOfEmployees();
        System.out.println(wage);


        var browser = new Browser();
        browser.navigate("");*/

       /* var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());*/

      /*  var box1 = new TextBox();
        box1.setTex("Om");
        System.out.println(box1);*/

        /*var box2 = new TextBox();
        System.out.println(box1.toString());
        System.out.println(box2.hashCode());*/

    /*    var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);*/

/*        Point point1 = new Point(1,2);
        var point2 = new Point(1,2);

        System.out.println(point1.equals(point1));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());*/

        /*
        Poly-Morphism-
        Poly Means Many & Morphism Means Forms

        Many Forms -  it allow object to take many forms.
         */

        UIControl[] controls = {new TextBox(), new Checkbox()};

        for(var control: controls){
            control.render();
        }

    }

    // procedural Programming Example
    public static void   show(UIControl ctrl){
        if(ctrl instanceof TextBox) {
            var txtBox = (TextBox) ctrl;
            System.out.println(txtBox);
        }
    }
}
