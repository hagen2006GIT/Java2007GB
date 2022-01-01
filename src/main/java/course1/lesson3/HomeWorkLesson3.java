package course1.lesson3;

public class HomeWorkLesson3 {
    public static void main(String[] args) {

        Task1(new int[]{1, 1, 0, 0, 1});

    }

    public static void Task1(int[] arr) {

        printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        printArray(arr);
        }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}


