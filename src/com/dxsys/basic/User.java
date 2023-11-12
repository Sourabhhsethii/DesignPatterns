package com.dxsys.basic;

/**
 * The Essentials of Design Patterns
 */
public class User {
    // Fields (attributes)
    public String name;

    public User(String name, Integer age){
        this.name = name;
    }

    //Method
    public void sayHello(){
        System.out.println("-Hi, my name is " + name);
    }

}
