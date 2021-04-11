package Lesson4;

public class CreateClass {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type = "dog";
        animal.setName("Rex");
        animal.sex = 'm';

        animal.speak();
    }
}