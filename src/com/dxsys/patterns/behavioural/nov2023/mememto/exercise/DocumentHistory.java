package com.dxsys.patterns.behavioural.nov2023.mememto.exercise;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    List<DocumentState> documentStateList = new ArrayList<>();

    public void push(DocumentState documentState){
        this.documentStateList.add(documentState);
    }

    public DocumentState  pop() {
        var lastIndex = documentStateList.size() -1;
        var lastState = this.documentStateList.get(lastIndex);
        this.documentStateList.remove(lastState);
        return lastState;
    }
}
