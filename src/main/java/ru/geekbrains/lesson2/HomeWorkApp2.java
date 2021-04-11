package ru.geekbrains.lesson2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        boolean one = one(5, 65);
        System.out.println(one);
        two(4);
        boolean three = three(9);
        System.out.println(three);
        four(5, "Java");
        boolean five = five(2003);
        System.out.println(five ? "Високосный" : "Не високосный");

    }

    public static boolean one(int a, int b) {
        int c = a + b;
        return (10 <= c) && (c <= 20);

    }

    public static void two(int a) {
        System.out.println(a < 0 ? "Отрицательное" : "Положительное");
    }

    public static boolean three(int a) {
        return a < 0;
    }

    public static void four(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static boolean five(int y) {
        return ((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0);
    }

}




