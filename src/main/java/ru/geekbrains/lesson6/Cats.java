package ru.geekbrains.lesson6;

public class Cats extends Animal {
    public Cats(String name) {
        super(name);
    }

    @Override
    public void run(int r) {
        if (r > 200) {
            System.out.println("Кошка сдохла");
        } else {
            super.run(r);
        }
    }

    @Override
    public void swim(int s) {
        System.out.println("Кошка убежала");
    }
}
