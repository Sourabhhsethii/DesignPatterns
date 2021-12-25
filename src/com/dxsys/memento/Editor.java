package com.dxsys.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Violation of Single Responsibility Principle (SRS) - Every Class should has single Responsibility for doing any task
 * Editor State is include in the Editor Class which will have Tight Coupling As well... ...
 */
public class Editor {
    private String content;
    // private List<EditorState> preState; --> Don't have this in this class , let have another class to  maintain the state of the application
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void undo(){
    }

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restoreState(EditorState states){
        content = states.getContent();
    }
}

class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }
    public EditorState pop(){
        var lastIndex = states.size() -1;

        var lastState = states.get(lastIndex);

        states.remove(lastState);

        return lastState;
    }
}

class EditorState {
    private final String content;

    public EditorState(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
