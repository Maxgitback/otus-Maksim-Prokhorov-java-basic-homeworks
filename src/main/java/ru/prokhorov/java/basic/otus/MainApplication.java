package ru.prokhorov.java.basic.otus;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        User user1 = new User("Иванов", "Иван", "Иванович", 2000,
                "coolblVan2000@email.ru");
        user1.info();
        System.out.println(user1.getEmail());
        User[] users = new User[10];
        users[0] = new User("Александров", "Александр", "Александрович", 1978,
                "fgfgan1978@email.ru");
        users[1] = new User("Петров", "Петр", "Петрович", 1966,
                "fgfga1966@email.ru");
        users[2] = new User("Сидоров", "Сидор", "Сидорович", 1958,
                "fgfgan1958@email.ru");
        users[3] = new User("Кузнецов", "Кузьма", "Кузьмич", 1996,
                "fgfgan1996@email.ru");
        users[4] = new User("Морозов", "Мороз", "Морозович", 1991,
                "fgfgan1991@email.ru");
        users[5] = new User("Новиков", "Новик", "Новикович", 1945,
                "fgfgan1945@email.ru");
        users[6] = new User("Федоров", "Федор", "Федорович", 1977,
                "fgfgan1977@email.ru");
        users[7] = new User("Михайлов", "Михаил", "Михайлович", 2003,
                "fgfgan2003@email.ru");
        users[8] = new User("Максимов", "Максим", "Максимович", 2010,
                "fgfgan2010@email.ru");
        users[9] = new User("Яковлев", "Яков", "Яковлевич", 1984,
                "fgfgan1984@email.ru");
        int year = 2024;
        int age;
        for (int i = 0; i < users.length; i++) {
            age = year - users[i].getYearOfBirth();
            if (age >= 40) {
                users[i].info();
            }
        }
        Box box1 = new Box(4,4,"brown");
        box1.info();
        box1.setColor("White");
        box1.info();
        box1.itOpens();
        box1.setInside("палка");
        box1.info();
        box1.itsClosing();
        box1.info();
        box1.itOpens();
        box1.throwItAway();
        box1.info();

    }
}
