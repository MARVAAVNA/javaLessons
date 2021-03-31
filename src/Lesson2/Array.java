package Lesson2;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[6];

        System.out.println(arr[3]);

        arr[1] = 15;
        arr[5] = -32;

        if (arr[5] > 0) {
            System.out.println(arr[5]);
        } else {
            System.out.println(arr.length);
        }

        int[] arr1 = {5, 6, 9, -48, 32, 0};

        System.out.println(arr1[3]);

        if (arr1[4] > arr[2]) {
            System.out.println("ok");
        }

        int[] arr2 = new int[] {15, 35};

        System.out.println(arr2[1] + arr1[3]);
    }
}
