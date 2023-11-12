package com.dxsys.patterns.behavioural.nov2023.mememto.exercise;

import com.dxsys.patterns.behavioural.nov2023.mememto.EditorState;

public class DocumentEditor {

    private String content;
    private String fontName;
    private String fontSize;

    public DocumentState createState() {
        return new DocumentState(content,fontName,fontSize);
    }

    public void restore(DocumentState state){
        content = state.getContent();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
}
