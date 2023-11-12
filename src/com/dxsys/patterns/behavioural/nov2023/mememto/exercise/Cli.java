package com.dxsys.patterns.behavioural.nov2023.mememto.exercise;

public class Cli {
    public static void main(String[] args) {

        var documentContent = new DocumentEditor();
        var documentHistory = new DocumentHistory();

        documentContent.setContent("a");
        documentContent.setFontName("Italic");
        documentContent.setFontSize("2");

        documentHistory.push(documentContent.createState());
        System.out.println(documentContent.getContent());
        System.out.println(documentContent.getFontName());
        System.out.println(documentContent.getFontSize());

        documentContent.setContent("b");
        documentContent.setFontName("Italic");
        documentContent.setFontSize("5");

        documentHistory.push(documentContent.createState());
        System.out.println(documentContent.getContent());
        System.out.println(documentContent.getFontName());
        System.out.println(documentContent.getFontSize());

        documentContent.restore(documentHistory.pop());
        documentContent.restore(documentHistory.pop());
        System.out.println(documentContent.getContent());
        System.out.println(documentContent.getFontName());
        System.out.println(documentContent.getFontSize());
    }
}
