package com.dxsys.patterns.behavioural.nov2023.mememto;

public class Cli {
    public static void main(String[] args) {
        /**
         * Store the editor State in History
         */
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());


    }
}
