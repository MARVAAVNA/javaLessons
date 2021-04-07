package Lesson4;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 15, -6, 25, 0, -86, 694, 1367, 1, -5};
        boolean check = true;
        int count = 0;

        while(check) {
            check = false;
            count++;
            for (int i = 0; i < arr.length - count; i++) {
                if (arr[i + 1] < arr[i]) {
                    arr[i] += arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] -= arr[i + 1];
                    check = true;
                }
            }
        }
    }
}
