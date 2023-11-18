package com.dxsys.patterns.behavioural.nov2023.templatemethod.solution;

public class CancelTransferTask extends Task{

    @Override
    protected void doExecuteOrder() {
        System.out.println("I am canceling the task");
    }

    @Override
    protected void pay() {
        System.out.println("paying for cancel order task");
    }
}
