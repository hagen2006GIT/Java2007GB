package course1.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4_CrossesZeroesApp {
    //Поле
    public static char[][] map;

    //Размер поля
    public static final int SIZE = 5;

    //Точек для победы
    public static final int DOTS_TO_WIN = 4;

    //Описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);
    //рандом
    public static final Random RANDOM = new Random();

    /**
     * Проинициализироваать поле.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
            //Arrays.fill(map[i], DOT_EMPTY); - тоже самое, но проще писать
        }
    }

    /**
     * Вывод игрового поля на экран.
     */
    public static void printMap() {
        //нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //пишем строки мапы
        for (int i = 0; i < map.length; i++) {
            //выводим номер строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека.
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    /**
     * Ход робота.
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * Проверка валидны ли значения поля
     *
     * @param x координата X
     * @param y координата Y
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    /**
     * Проверка победы.
     * @param symbol Символ для которого проверяем. Крестик или нолик
     * @return true, если выиграл
     */
    public static boolean checkWin(char symbol) {
        int countWin;
//столбцы
        for (int x = 0; x < map.length; x++) {
            countWin = 0;
            for (int y = 0; y < map[x].length; y++) {
                if (map[x][y] == symbol) {
                    countWin +=1;
                }
            }
            if (countWin == DOTS_TO_WIN) {
                return true;
            }
        }
//строки
        for (int y = 0; y < map.length; y++) {
            countWin = 0;
            for (int x = 0; x < map[y].length; x++) {
                if (map[x][y] == symbol) {
                    countWin += 1;
                }
            }
            if (countWin == DOTS_TO_WIN) {
                return true;
            }
        }
//диагональ прямая
       countWin = 0;
       for (int x = 0; x < map.length; x++) {
           for (int y = 0; y < map[x].length; y++) {
               if (x == y) {
                   if (map[x][y] == symbol) {
                       countWin += 1;
                   }
               }
           }
           if (countWin == DOTS_TO_WIN) {
               return true;
           }
       }
//диагональ обратная
        countWin = 0;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (x + y + 1 == SIZE) {
                    if (map[x][y] == symbol) {
                        countWin += 1;
                    }
                }
            }
            if (countWin == DOTS_TO_WIN) {
                return true;
            }
        }
       return false;
    }

    /**
     * Проверка что в поле не осталось ни одной ссвободной ячейки.
     *
     * @return true, если нет ни одной свободной
     */
    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Побеждает человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Робот выиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Game over");

    }
}
