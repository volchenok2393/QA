package ru.geekbrains.lesson6;

public class Animal {
    private String name;

    public void run(int r) {
        System.out.println(name + " пробежал " + r + " метров ");
    }

    public void swim(int s) {
        System.out.println(name + " проплыл " + s + " метров ");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal() {
    }
}