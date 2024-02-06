package Seminar3.Seminar.model;

public class Employe {
    private String firstName;
    private String lastName;
    private String midlName;
    private String post;
    private int age;
    private String phoneNumber;
    private int solary;

    public Employe(String firstName, String lastName, String midlName, String post, int age, String phoneNumber, int solary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midlName = midlName;
        this.post = post;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.solary = solary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", midlName='" + midlName + '\'' +
                ", post='" + post + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", solary=" + solary +
                '}';
    }
}
