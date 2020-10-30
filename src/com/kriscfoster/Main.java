package com.kriscfoster;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("John", 20000);
        Payroll payroll = new Payroll();
        TaxMan taxMan = new TaxMan();
        employee.addObserver(payroll);
        employee.addObserver(taxMan);
        employee.changeSalary(23000);
        employee.changeSalary(24000);
    }
}
