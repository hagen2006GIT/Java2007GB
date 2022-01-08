package course1.lesson3;

import java.util.Arrays;

public class HomeWorkLesson3 {
    public static void main(String[] args) {

        task1(new int[]{1, 1, 0, 0, 1});

        task2(new int[100]);

        task3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});

        task4(5);

        System.out.println("Task5 results:");
        printArray(task5(8,158));

        task6(new int[]{6, 4, 24, 2, 15});

        task8(new int[]{1, 2, 3, 4, 5},9);

    }

    public static void task8(int[] arr, int n) {

        int[] arrNew = new int[arr.length];

        System.out.println("Task8 results:");
        System.out.print("array before shift\t: ");
        printArray(arr);

        if (n == 0) {
            System.out.println("n = 0 - сдвига нет");
            System.out.print("array after shift\t: ");
            printArray(arr);
            return;
        }

        for (int j = 1; j < Math.abs(n)+1; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (n > 0) { //сдвиг вправо
                    if (i == arr.length-1) {
                        arrNew[0] = arr [arr.length-1];
                    } else {
                        arrNew[i+1] = arr [i];
                    }
                } else { //сдвиг влево
                    if (i == 0) {
                        arrNew[arr.length-1] = arr [0];
                    } else {
                        arrNew[i-1] = arr [i];
                    }
                }
            }
            arr = arrNew.clone();
        }

        System.out.print("array after shift\t: ");
        printArray(arrNew);

    }

    public static void task6(int[] arr) {

        int vMin=arr[0];
        int vMax=arr[0];

        System.out.println("Task6 results:");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < vMin) {
                vMin=arr[i];
            }
            if (arr[i] > vMax) {
                vMax=arr[i];
            }
        }
        System.out.println("Минимальное значение = " + vMin);
        System.out.println("Максимальное значение = " + vMax);
    }

    public static void task4 (int len) {

        int[][] array=new int[len][len];
        int k=len-1;

        System.out.println("Task4 results:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j]=1;
                }
                if (j == k) {
                    array[i][k]=1;
                    k--;
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void task1(int[] arr) {

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

    public static void task2(int[] arr) {

        System.out.println("Task2 results:");

        for (int i = 0; i < arr.length; i++) {
                arr[i] = i+1;
            }

        printArray(arr);
    }

    public static void task3(int[] arr) {

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

    public static int[] task5(int len, int initialValue) {

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


