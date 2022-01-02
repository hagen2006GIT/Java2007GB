package course1.lesson3;

import java.util.Arrays;

public class HomeWorkLesson3 {
    public static void main(String[] args) {

        Task1(new int[]{1, 1, 0, 0, 1});

        Task2(new int[100]);

        Task3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});

        Task4(5);

        System.out.println("Task5 results:");
        printArray(Task5(8,158));

    }

    public static void Task4 (int len) {

        int[][] array = new int[len][len];

        System.out.println("Task4 results:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Task1(int[] arr) {

        System.out.println("Task1 results:");
        System.out.print("array before trahsformation\t: ");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }

        System.out.print("array after trahsformation\t: ");
        printArray(arr);
        }

    public static void Task2(int[] arr) {

        System.out.println("Task2 results:");

        for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
            }

        printArray(arr);
    }

    public static void Task3(int[] arr) {

        System.out.println("Task3 results:");
        System.out.print("array before trahsformation\t: ");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.print("array after trahsformation\t: ");
        printArray(arr);
    }

    public static int[] Task5(int len, int initialValue) {

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
        }
//        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%2s", array[i]) + " ");

        }
        System.out.println();

    }
}


