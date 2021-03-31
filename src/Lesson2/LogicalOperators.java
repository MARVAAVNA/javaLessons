package Lesson2;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        boolean c = true;

        if (a > 5 && b < 15) {
            System.out.println("A more B");
        } else {
            System.out.println("A is less than B");
        }

        if (a > b || b > 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (!(!c || a < 60)) {
            System.out.println("A more B");
        } else {
            System.out.println("A is less than B");
        }
    }
}
