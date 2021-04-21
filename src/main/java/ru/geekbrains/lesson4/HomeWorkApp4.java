package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    public static int SIZE = 5;
    public static int DOT_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] arg) {
        while (true) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_0)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }
    }

    public static boolean checkWin(char symb) {

        for (int i = 0; i < SIZE - DOT_TO_WIN + 1; i++) {
            for (int j = 0; j < SIZE; j++) {
                int n = 0;
                for (int k = i; k < DOT_TO_WIN + i; k++) {
                    if (map[k][j] != symb) {
                        break;
                    } else {
                        n = n + 1;
                    }
                }
                if (n == DOT_TO_WIN) {
                    return true;
                }
            }
        }

        for (int i = 0; i < SIZE - DOT_TO_WIN + 1; i++) {
            for (int j = 0; j < SIZE; j++) {
                int n = 0;
                for (int k = i; k < DOT_TO_WIN + i; k++) {
                    if (map[j][k] != symb) {
                        break;
                    } else {
                        n = n + 1;
                    }
                }
                if (n == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        int d = SIZE - DOT_TO_WIN + 1;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d - i; j++) {
                int n = 0;
                for (int k = i, m = j; k < DOT_TO_WIN + i; k++, m++) {
                    if (map[k][m] != symb) {
                        break;
                    } else {
                        n = n + 1;
                    }
                }
                if (n == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        for (int i = 0; i < d; i++) {
            for (int j = SIZE - 1; j >= SIZE - d + i; j--) {
                int n = 0;
                for (int k = i, m = j; k < DOT_TO_WIN + i; k++, m--) {
                    if (map[k][m] != symb) {
                        break;
                    } else {
                        n = n + 1;
                    }
                }
                if (n == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        for (int i = SIZE - 1; i >= SIZE - d; i--) {
            for (int j = SIZE - 1; j >= i - d + 1; j--) {
                int n = 0;
                for (int k = i, m = j; k >= DOT_TO_WIN - d; k--, m--) {
                    if (map[k][m] != symb) {
                        break;
                    } else {
                        n = n + 1;
                    }
                }
                if (n == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        for (int i = SIZE - 1; i >= SIZE - d; i--) {
            for (int j = 0; j < i + d + 1 - SIZE; j++) {
                int n = 0;
                for (int k = i, m = j; k >= DOT_TO_WIN - d; k--, m++) {
                    if (map[k][m] != symb) {
                        break;
                    } else {
                        n = n + 1;
                    }
                }
                if (n == DOT_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            int dotToWin = DOT_TO_WIN - 1;
            for (int i = 0; i < SIZE - dotToWin + 1; i++) {
                for (int j = 0; j < SIZE; j++) {
                    int n = 0;
                    for (int k = i; k < dotToWin + i; k++) {
                        if (map[k][j] != DOT_X) {
                            break;
                        } else {
                            n = n + 1;
                        }
                    }
                    if (n == dotToWin) {
                        if (n + i == SIZE) {
                            map[i - 1][j] = DOT_0;
                            return;
                        }
                        if (map[n + i][j] != DOT_0) {
                            map[n + i][j] = DOT_0;
                            return;
                        }

                    }
                }
            }
            for (int i = 0; i < SIZE - dotToWin + 1; i++) {
                for (int j = 0; j < SIZE; j++) {
                    int n = 0;
                    for (int k = i; k < dotToWin + i; k++) {
                        if (map[j][k] != DOT_X) {
                            break;
                        } else {
                            n = n + 1;
                        }
                    }
                    if (n + i == SIZE) {
                        map[j][i - 1] = DOT_0;
                        return;
                    }
                    if (n == dotToWin) {
                        if (map[j][n + i] != DOT_0) {
                            map[j][n + i] = DOT_0;
                            return;
                        }
                    }
                }
            }


            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


