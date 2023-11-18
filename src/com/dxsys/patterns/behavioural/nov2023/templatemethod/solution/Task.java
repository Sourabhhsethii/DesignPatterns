package com.dxsys.patterns.behavioural.nov2023.templatemethod.solution;

import com.dxsys.patterns.behavioural.nov2023.templatemethod.problem.AuditTrl;

/**
 * Template Method Class - here execute is template method which as template of operations defined.
 */
public abstract class Task {

    private AuditTrl auditTrl;

    public Task(){
        auditTrl = new AuditTrl();
    }

    /**
     * Multiple Tasks are implemented here!!!
     * Few Behaviours are decided by subclassed such as doExecuteOrder & pay!!!
     * execute methods defined the steps -> few are concrete implementations & few are abstract who's implementation responsibility is dedicated to subclasses.
     */
    public void execute(){
        auditTrl.record();
        doExecuteOrder();
        auditTrl.record();
        pay();
        closing();
    }
    protected abstract void doExecuteOrder();
    protected abstract void pay();

    public void closing(){
        System.out.println("Closing the txn");
    }
}
