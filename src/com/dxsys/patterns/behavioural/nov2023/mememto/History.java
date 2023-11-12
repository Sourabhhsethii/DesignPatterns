package com.dxsys.patterns.behavioural.nov2023.mememto;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class History {

    List<EditorState> state = new ArrayList<>();

    public EditorState pop() {
        var lastIndex = state.size() -1;
        var lastState = state.get(lastIndex);
        state.remove(lastState);
        return lastState;
    }

    public void push(EditorState state) {
        this.state.add(state);
    }
}
