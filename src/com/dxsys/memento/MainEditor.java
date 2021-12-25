package com.dxsys.memento;

public class MainEditor {

    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restoreState(history.pop());



    }
}
