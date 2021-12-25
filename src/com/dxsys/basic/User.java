package com.dxsys.basic;

public class User {
    // Fields (attributes)
    public String name;

    public User(String name, Integer age){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("-Hi, my name is " + name);
    }
    //Method
}
