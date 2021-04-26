package ru.geekbrains.lesson6;

public class Dogs extends Animal {
    public Dogs(String name) {
        super(name);
    }

    @Override
    public void run(int r) {
        if (r > 500) {
            System.out.println("Собака сдохла");
        } else {
            super.run(r);
        }
    }

    @Override
    public void swim(int s) {
        if (s > 10) {
            System.out.println("Собака утонула");
        } else {
            super.swim(s);
        }
    }
}
