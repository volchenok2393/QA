package ru.geekbrains.lesson5;

public class User {
    public String name;
    public String position;
    public String email;
    public int numberPhone;
    public int earnings;
    public int age;


    public User(String name, String position, String email, int earnings, int numberPhone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.earnings = earnings;
        this.numberPhone = numberPhone;
        this.age = age;

    }

    public void info() {
        System.out.println("Name: " + name + "; position: " + position + "; email: " + email + "; Number Phone: " + numberPhone + "; earnings: " + earnings + "; age: " + age);
    }
}