package pl.infoshare.lukasz;

public class ThisIsAProblem {

    public String firstName;
    public String lastName;
    public String fullName;

    public ThisIsAProblem(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = first + " " + last;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
