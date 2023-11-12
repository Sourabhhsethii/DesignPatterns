package com.dxsys.patterns.behavioural.nov2023.mememto.exercise;

/**
 *
 * In the Exercises project,
 * look at the code in the memento/Document class. This class represents a document in a word processor like MS Word or Apple Pages.
 * Our Document class has three attributes:  -content -fontName -fontSize   We should allow the user to undo the changes to any of these attributes.
 * In the future, we may add additional attributes in this class and these attributes should also be undoable.
 * Implement the undo feature using the memento pattern.
 */
public class DocumentState {

    private final String content;
    private final String fontName;
    private final String fontSize;

    public DocumentState(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }
}
