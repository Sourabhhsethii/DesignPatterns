package com.dxsys.code.mosh.oops.classes;

public class Employee {
    private static int numberOfEmployee;
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }

    public Employee(int baseSalary) {
       this(baseSalary,0);
    }

    public static void printNoOfEmployees(){
        System.out.println(numberOfEmployee);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(baseSalary<0){
            throw new IllegalArgumentException("Salary Cannot be zero or less");
        }
        this.hourlyRate = hourlyRate;
    }


    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    private void setBaseSalary(int baseSalary){

        if(baseSalary<=0){
            throw new IllegalArgumentException("Salary Cannot be zero or less");
        } else this.baseSalary = baseSalary;

    }

    public int calculateWage() {
        return calculateWage(0);
    }
}
