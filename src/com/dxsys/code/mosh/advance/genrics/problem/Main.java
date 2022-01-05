package com.dxsys.code.mosh.advance.genrics.problem;

public class Main {
    public static void main(String[] args) {

        var list = new List(10);
        list.add("a");
        list.add(1);
        list.add( new User(1));
        list.add('a');

        for (Object obj: list.get()){
            if(obj!= null){
                System.out.println(obj);
            }
        }

    }
}
