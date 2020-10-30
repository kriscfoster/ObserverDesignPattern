package com.kriscfoster;

public class TaxMan implements Observer {

    @Override
    public void update(Subject subject) {
        Employee employee = (Employee) subject;
        String string = employee.getName() +
                " needs to pay " +
                employee.getSalary() * 0.2 +
                " in taxes";
        System.out.println(string);
    }
}
