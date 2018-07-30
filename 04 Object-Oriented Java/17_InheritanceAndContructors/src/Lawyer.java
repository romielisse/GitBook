public class Lawyer extends Employee {
    private String registrationNumber;

    public Lawyer(){
        super();
    }

    public Lawyer(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Lawyer(String firstName, String lastName, String registrationNumber) {
        super(firstName, lastName);
        this.registrationNumber = registrationNumber;
    }

    public Lawyer(int years, String registrationNumber) {
        super(years);
        this.registrationNumber = registrationNumber;
    }
}
