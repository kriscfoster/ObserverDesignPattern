package com.kriscfoster;

public class Payroll implements Observer {

    @Override
    public void update(Observable observable) {
        Employee employee = (Employee) observable;
        String stringBuilder = employee.getName() +
                " salary is now " +
                employee.getSalary();
        System.out.println(stringBuilder);
    }
}
