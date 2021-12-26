package com.dxsys.code.mosh.oops.classes;

public class Browser {

    public void navigate(String address){
     String ip = findIpAddress(address, true);
     String html = sendHttpAddress(ip);
        System.out.println(html);
    }

    private String sendHttpAddress(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }
}
