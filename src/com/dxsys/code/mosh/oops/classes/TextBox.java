package com.dxsys.code.mosh.oops.classes;

public class TextBox extends UIControl {

    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("Textbox");
    }

    public void setTex(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }

    @Override
    public String toString() {
        return text;
    }
}
