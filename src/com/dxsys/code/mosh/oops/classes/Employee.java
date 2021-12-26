package com.dxsys.code.mosh.oops.classes;

public class Employee {
    int baseSalary;
    int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }
}
