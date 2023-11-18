package com.dxsys.patterns.behavioural.nov2023.templatemethod.problem;

/**
 * Problem ? THink ?
 * Issue is Code duplication!!!
 * we need to always add these field : AuditTrl auditTrl
 * and initialize the code with Constructor of the class.
 */
public class TransferMoneyTask {

    private AuditTrl auditTrl;

    public TransferMoneyTask(AuditTrl auditTrl) {
        this.auditTrl = auditTrl;
    }

    public void execute(){
        auditTrl.record();
        System.out.println("Transfer Money");
    }
}
