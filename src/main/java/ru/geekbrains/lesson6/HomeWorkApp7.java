package ru.geekbrains.lesson6;

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cats[] cats = new Cats[]{
                new Cats("fifa", 11),
                new Cats("pepe", 20),
                new Cats("yip", 10),
                new Cats("H", 15)
        };
        Plate wiskas = new Plate(10);
        wiskas.add(40);
        for (Cats cat : cats) {
            cat.eat(wiskas);
            System.out.println(cat.getName() + " - " + (cat.isSatiety() ? "наелся" : "не наелся"));
        }
        System.out.println("Осталось: " + wiskas.getFood() + " кириешек");
    }
}
