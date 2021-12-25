package com.dxsys.basic;

public class MailService {

    public void sendEmail(){
        connect();
        authenticate();
        System.out.println("send mail");
        disconnect();
    }

    private void connect(){
        System.out.println("connect");
    }

    private void  disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }

}
