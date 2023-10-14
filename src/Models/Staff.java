package Models;

import Enums.Residence;

import java.util.List;

public abstract class Staff {

    private String firstName;
    private String lastName;
    private String gender;
    private Residence residentialState;

    public Staff(String firstName, String lastName, String gender, Residence residentialState) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.residentialState = residentialState;
    }

    public Staff() {
    }

    public Staff(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Residence getResidentialState() {
        return residentialState;
    }

    public void setResidentialState(Residence residentialState) {
        this.residentialState = residentialState;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", residentialState=" + residentialState +
                '}';
    }
}
