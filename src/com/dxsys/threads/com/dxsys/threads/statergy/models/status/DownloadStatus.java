package com.dxsys.threads.com.dxsys.threads.statergy.models.status;

public class DownloadStatus {

    private int totalBytes = 0;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalByte(){
        totalBytes++;
    }
}
