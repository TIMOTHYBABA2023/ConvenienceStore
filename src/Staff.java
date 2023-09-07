public abstract class Staff {

    private String firstName;
    private String lastName;
    private String gender;
    private String residentialState;

    public Staff(String firstName, String lastName, String gender, String residentialState) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.residentialState = residentialState;
    }

    public Staff() {
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

    public String getResidentialState() {
        return residentialState;
    }

    public void setResidentialState(String residentialState) {
        this.residentialState = residentialState;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", residentialState='" + residentialState + '\'' +
                '}';
    }
}
