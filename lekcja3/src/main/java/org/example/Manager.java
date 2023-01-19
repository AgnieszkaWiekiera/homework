package org.example;

public class Manager extends BaseEmployee{
    private final int baseSalary = 5000;
    int bonus = 500;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);

    }
    void changeManagerSalary(int newBonus){
        this.bonus = newBonus;
    }
    int calculateManagerSalary(){
        return super.calculateMonthlySalary() + bonus;
    }

}
