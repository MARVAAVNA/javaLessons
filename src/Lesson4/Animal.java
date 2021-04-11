package Lesson4;

public class Animal {
    String type;
    private String name;
    public char sex;

    public void speak() {
        System.out.println("Animal say something");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
