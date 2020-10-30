package edu.wctc.lab4;

import java.util.ArrayList;
import java.util.List;

public class HrPerson {

    private List<Employee> employees;

    public HrPerson() {
        employees = new ArrayList<>();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
        employees.add(e);
        orientEmployee(e);
    }

    private void orientEmployee(Employee e) {
        e.doFirstTimeOrientation("B101");
    }

    public void outputReport(String ssn) {
        for (Employee e : employees) {
            if (e.getSsn().equals(ssn)) {
                if (e.hasMetWithHr() && e.hasMetDeptStaff() && e.hasReviewedDeptPolicies() && e.hasMovedIn()) {
                    e.printReport();
                }
                break;
            }
        }
    }


}
