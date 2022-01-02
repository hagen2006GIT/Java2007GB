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

        Task6(new int[]{6, 4, 24, 2, 15});

        Task8(new int[]{1, 5, 3, 2, 11},2);

    }

    public static void Task8(int[] arr, int n) {

        int newIndex;
        int tmpValue;

        System.out.println("Task6 results:");
        System.out.print("array before shift\t: ");
        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            newIndex=i+n;
            if (newIndex >= arr.length){
                newIndex=newIndex-arr.length;
                tmpValue=arr[i];
                arr[newIndex]=arr[i];
            }
        }
        System.out.print("array after shift\t: ");
        printArray(arr);

    }

    public static void Task6(int[] arr) {

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

    public static void Task4 (int len) {

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


