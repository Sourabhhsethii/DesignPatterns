package com.dxsys.patterns.behavioural.nov2023.templatemethod.solution;

public class Cli {
    public static void main(String[] args) {
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();
        CancelTransferTask cancelTransferTask = new CancelTransferTask();
        cancelTransferTask.execute();
    }
}
