package ru.geekbrains.lesson6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Mimi");
        animal1.run(1000);
        animal1.swim(111);
        Dogs dog1 = new Dogs("Bob");
        dog1.run(100);
        dog1.swim(1);
        Cats cat1 = new Cats("H", 1);
        cat1.run(1200);
        cat1.swim(21);

    }
}
