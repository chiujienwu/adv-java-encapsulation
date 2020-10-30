package edu.wctc.property.lab1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly.
 * Also consider if any of the properties should be mandatory and use a constructor
 * to enforce that.
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 * Make sure you validate setters.
 * @author Jim Lombardo
 * @version 1.02
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr = false;
    private boolean metDeptStaff = false;
    private boolean reviewedDeptPolicies = false;
    private boolean movedIn = false;
    private String cubeId = null;
    private LocalDate orientationDate = null;

    public Employee (String firstName, String lastname, String ssn) {
        setFirstName(firstName);
        setLastName(lastname);
        setSsn(ssn);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        this.orientationDate = orientationDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", metWithHr=" + metWithHr +
                ", metDeptStaff=" + metDeptStaff +
                ", reviewedDeptPolicies=" + reviewedDeptPolicies +
                ", movedIn=" + movedIn +
                ", cubeId='" + cubeId + '\'' +
                ", orientationDate=" + orientationDate +
                '}';
    }

}
