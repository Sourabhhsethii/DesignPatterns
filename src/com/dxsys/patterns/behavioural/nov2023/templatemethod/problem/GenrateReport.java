package com.dxsys.patterns.behavioural.nov2023.templatemethod.problem;

public class GenrateReport {

    private AuditTrl auditTrl;

    public GenrateReport(AuditTrl auditTrl) {
        this.auditTrl = auditTrl;
    }

    public void execute(){
        auditTrl.record();
        System.out.println("Genrate Report");
    }


}
