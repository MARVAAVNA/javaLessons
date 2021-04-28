package Lesson6.model;

public class Student {
    private String firstName;
    private String lastName;
    private short year;
    private char gender;
    private double mark;

    public Student(String firstName, String lastName, short year) {
        setFirstName(firstName);
        setLastName(lastName);
        setYear(year);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        if (year > 1900) {
            this.year = year;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        }
    }

    public void printInfo() {
        System.out.println("----------------------------------------------------");
        System.out.printf("First Name: %s\n", firstName);
        System.out.printf("Last Name: %s\n", lastName);
        System.out.printf("Year: %d\n", year);
        System.out.printf("Gender: %s\n", gender == 'm' ? "male" : "female");
        System.out.printf("Mark: %f\n", mark);
    }
}
