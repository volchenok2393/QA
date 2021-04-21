package ru.geekbrains.lesson5;

import javax.jws.soap.SOAPBinding;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        User[] human = new User[5];
        human[0] = new User("Nina Volkova", "manager", "vilk@mail.ru", 100, 891338075, 27);
        human[1] = new User("Vitalik S", "IT Lead", "S@ru", 400, 8656, 25);
        human[2] = new User("Marins V", "program", "M@com", 10, 8999, 22);
        human[3] = new User("bird", "manager", "kolebor@ru", 700, 8985, 46);
        human[4] = new User("Mak", "manager", "maks@com", 370, 8911, 41);
        for (int i = 0; i < human.length; i++) {
            if (human[i].age > 40) {
                human[i].info();
            }
        }
    }
}
