package org.example;

public class BaseEmployee {
    String name;
    String surname;
    final int baseSalary = 3000;
    final int yearOfEmployment;

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }

    protected int calculateMonthlySalary(){
        return baseSalary;
    }

    int howLongEmployeeWork(){
        return 2023 - yearOfEmployment;
    }
}
