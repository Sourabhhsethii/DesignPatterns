package com.dxsys.patterns.behavioural.nov2023.templatemethod.solution;

import com.dxsys.patterns.behavioural.nov2023.templatemethod.problem.AuditTrl;

public class TransferMoneyTask extends Task{

    @Override
    protected void doExecuteOrder() {
        System.out.println("Transfer Money");
    }

    @Override
    protected void pay() {
        System.out.println("Paying for this TransferMoneyTask");
    }
}
