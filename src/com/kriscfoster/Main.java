package com.kriscfoster;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("John", 20000);
        Payroll payroll = new Payroll();
        employee.addObserver(payroll);
        employee.changeSalary(23000);
        employee.changeSalary(24000);
    }
}
