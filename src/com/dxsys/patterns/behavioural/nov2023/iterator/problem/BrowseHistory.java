package com.dxsys.patterns.behavioural.nov2023.iterator.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * If we change internals of this class -> This call will break as well as client class will also breaks!!!!
 */
public class BrowseHistory {


    private List<String>  urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastIndex = urls.size() -1;
        var lastUrl =  urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
