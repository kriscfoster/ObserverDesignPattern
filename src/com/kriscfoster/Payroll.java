package com.kriscfoster;

public class Payroll implements Observer {

    @Override
    public void update(Subject subject) {
        Employee employee = (Employee) subject;
        String stringBuilder = employee.getName() +
                " salary is now " +
                employee.getSalary();
        System.out.println(stringBuilder);
    }
}
