package ru.geekbrains.lesson6;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean eat(int amount) {
        if (food < amount) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public int getFood() {
        return food;
    }

    public void add(int addFood) {
        food += addFood;
    }
}


