package ru.geekbrains.lesson6;

public class Cats extends Animal {
    public Cats(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    private boolean satiety = false;
    private int amount;

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

    public void eat(Plate plate) {
        satiety = plate.eat(amount);
    }

    public boolean isSatiety() {
        return satiety;
    }
}
