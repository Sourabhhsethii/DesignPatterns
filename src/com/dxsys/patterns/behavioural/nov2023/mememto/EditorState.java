package com.dxsys.patterns.behavioural.nov2023.mememto;

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "EditorState{" +
                "content='" + content + '\'' +
                '}';
    }
}
