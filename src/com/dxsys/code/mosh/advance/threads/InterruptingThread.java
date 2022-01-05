package com.dxsys.code.mosh.advance.threads;

public class InterruptingThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownloadFileTask(new DownloadStatus()));
        thread.start();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
