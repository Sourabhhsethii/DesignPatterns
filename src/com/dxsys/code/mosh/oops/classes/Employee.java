package com.dxsys.code.mosh.oops.classes;

public class Employee {
    private int baseSalary;

    private int hourlyRate;

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if(baseSalary<=0){
            throw new IllegalArgumentException("Salary Cannot be zero or less");
        }
        this.hourlyRate = hourlyRate;
    }


    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary){

        if(baseSalary<=0){
            throw new IllegalArgumentException("Salary Cannot be zero or less");
        } else this.baseSalary = baseSalary;

    }
}
