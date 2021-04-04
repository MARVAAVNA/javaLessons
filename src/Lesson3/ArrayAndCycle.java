package Lesson3;

public class ArrayAndCycle {
    public static void main(String[] args) {
//        Create an array and fill it with 2 number.
        int[] arr1 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 2;
        }

//        Create an array and fill it with numbers from 1:1000.

        int[] arr2 = new int[1000];

        for (int i = 0; i < 1000; i++) {
            arr2[i] = i + 1;
        }

//        Create an array and fill it with odd numbers from -20:20

        int[] arr3 = new int[20];

        for (int i = -19, j = 0; i < 20; i += 2, j++) {
            arr3[j] = i;
        }

        int[] arr4 = {7, 15, -95, 13, 5, 18, -8, 16, -55};

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 5 == 0) {
                System.out.println(arr4[i]);
            }
        }

//        Create an array and fill it. Print all elements which are between 24.12 and 467.23.

        System.out.println("---------------------------------------");

        float[] arr5 = {1.58f, 96.35f, 12.26f, 8f, 258f, 962.256f, 381.2f};

        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > 24.12 && arr5[i] < 467.23) {
                System.out.println(arr5[i]);
            }
        }

//        Create an array and fill it. Print count of elements which can be divided by 2.

        System.out.println("---------------------------------------");

        int[] arr6 = {5, 61, 36, -52, 95, 159, -954, 35, 64, 15};
        int count = 0;

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

//        Given an integer, 0< N < 21 , print its first 10 multiples.

        System.out.println("---------------------------------------");

        byte n = 6;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n%d x %d = %d", n, i, n * i);
        }
    }
}
