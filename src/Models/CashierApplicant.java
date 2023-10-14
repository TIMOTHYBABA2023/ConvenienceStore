package Models;

import Enums.Qualification;
import Enums.Residence;

public class CashierApplicant {

    private String firstName;
    private String lastName;
    private String gender;
    private  String email;
    private Qualification qualification;
    private Residence residence;

    public CashierApplicant(String firstName, String lastName, String gender,
                            String email, Qualification qualification, Residence residence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.qualification = qualification;
        this.residence = residence;
    }

    public CashierApplicant() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }


    @Override
    public String toString() {
        return "CashierApplicant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", qualification=" + qualification +
                ", residence=" + residence +
                '}';
    }
}
