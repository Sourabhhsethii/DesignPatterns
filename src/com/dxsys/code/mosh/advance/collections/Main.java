package com.dxsys.code.mosh.advance.collections;

import com.dxsys.code.mosh.advance.genrics.solution.GenricList;

public class Main {

    public static void main(String[] args) {
        var list = new GenricList<String>();
        list.add("a");
        list.add("b");


        for (var item: list)
            System.out.println(item);

    }
}
