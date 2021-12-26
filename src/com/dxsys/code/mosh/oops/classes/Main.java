package com.dxsys.code.mosh.oops.classes;

public class Main {

    public static void main(String[] args) {

        var textBox = new TextBox();
        textBox.setTex("Box 1");

        System.out.println(textBox.text.toUpperCase());
        textBox.clear();
        System.out.println(textBox.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setTex("Box 2");

        System.out.println(textBox2.text.toUpperCase());

    }
}
