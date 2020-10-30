package edu.wctc.lab4;

import edu.wctc.lab4.solution.HrPerson;

public class Company {

    private HrPerson hr;

    public Company() {
        hr = new HrPerson();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }
}
