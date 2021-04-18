package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1:");
        one();
        System.out.println("\n\nЗадание 2:");
        two();
        System.out.println("\n\nЗадание 3:");
        three();
        System.out.println("\n\nЗадание 4:");
        four(8);
        System.out.println("\nЗадание 5:");
        //five(8, 3);
        int[] five = five(4, 5);
        System.out.println(Arrays.toString(five));
        System.out.println("\nЗадание 6*:");
        six();
        System.out.println("\nЗадание 7**:");
        System.out.println(seven(new int[]{1, 5, 3, 2, 11, 11, 5, 3, 2, 0, 0, 1}));
        System.out.println("\nЗадание 8***:");
        eight(new int[]{1, 2, 3, 4}, -1);

    }

    public static void one() {
        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 0) {
                arrOne[i] = 1;
            } else arrOne[i] = 0;
            System.out.print(arrOne[i] + " ");
        }
    }

    public static void two() {
        int[] arrTwo = new int[100];
        for (int i = 0;
             i < 100; i++) {
            arrTwo[i] = i + 1;
            System.out.print(arrTwo[i] + " ");
        }
    }


    public static void three() {
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] = arrThree[i] * 2;
                System.out.print(arrThree[i] + " ");
            }
        }
    }

    public static void four(int size) {
        int[][] arrFour = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == size - i - 1) {
                    arrFour[i][j] = 1;
                } else {
                    arrFour[i][j] = 0;
                }
                System.out.print(arrFour[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] five(int len, int initialValue) {
        int[] arrFive = new int[len];
        for (int i = 0; i < len; i++) {
            arrFive[i] = initialValue;
        }
        return arrFive;
    }

    public static void six() {
        int[] arrSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1};
        int min, max;
        min = max = arrSix[0];
        for (int i = 0; i < arrSix.length; i++) {
            if (max < arrSix[i]) max = arrSix[i];
            if (min > arrSix[i]) min = arrSix[i];
        }
        System.out.println(" max: " + max + " min: " + min);
    }

    public static boolean seven(int[] arrSeven) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arrSeven.length - 1; i++) {
            leftSum = leftSum + arrSeven[i];
            rightSum = 0;
            for (int j = i + 1; j < arrSeven.length; j++) {
                rightSum = rightSum + arrSeven[j];
            }
            if (rightSum == leftSum) return true;
        }
        return false;
    }

    public static void eight(int[] arrEight, int n) {

        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int a = arrEight[0];
                for (int i = 0; i < arrEight.length - 1; i++) {
                    arrEight[i] = arrEight[i + 1];
                }
                arrEight[arrEight.length - 1] = a;
            }
        } else if (n < 0) {
            for (int j = 0; j > n; j--) {
                int b = arrEight[arrEight.length - 1];
                for (int i = arrEight.length - 1; i > 0; i--) {
                    arrEight[i] = arrEight[i - 1];
                }
                arrEight[0] = b;
            }
        }


        System.out.println(Arrays.toString(arrEight));
    }

}
