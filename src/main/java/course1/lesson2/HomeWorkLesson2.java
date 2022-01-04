package course1.lesson2;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        System.out.println("task 1 result: " + Task1(12, 8));
        Task2(-2);
        System.out.println("task 3 result: " + Task3(-2));
        Task4(2, "task 4 result: строка-параметр");
        System.out.println("task 5 result: " + Task5(1147));
    }

    public static boolean Task1(int n1, int n2) {
        int sum = n1 + n2;

        /*        System.out.println("sum = " + sum);*/
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void Task2(int n1) {
        String result = "отрицательное";

        if (n1 >= 0) {
            result = "положительное";
        }
        System.out.println("task 2 result: " + result);
        ;
    }

    public static boolean Task3(int n1) {
        boolean result = false;

        if (n1 >= 0) {
            result = true;
        }
        return result;
    }

    public static void Task4(int n1, String s1) {

        for (int i = 0; i < n1; i++) {
            System.out.println(s1);
        }
    }

    public static boolean Task5(int year) {

        int div4 = year % 4;
        int div100 = year % 100;
        int div400 = year % 400;
        boolean result = false;

        switch (div4) {
            case 0: {
                if (div100 > 0) {
                    result = true;
                } else if (div100 == 0 && div400 == 0) {
                    result = true;
                }  else if (div100 == 0 && div400 > 0) {
                    result = false;
                }
            }
        }
        return result;
    }
}
