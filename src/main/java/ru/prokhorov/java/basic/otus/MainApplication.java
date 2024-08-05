package ru.prokhorov.java.basic.otus;

import ru.prokhorov.java.basic.otus.animal.Cat;
import ru.prokhorov.java.basic.otus.animal.Dog;
import ru.prokhorov.java.basic.otus.animal.Horse;

public class MainApplication {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 1,3, 1000);
        Dog dog1 = new Dog("Bobik", 1,2,1000);
        Horse horse1 = new Horse("Burya",1,4,100);
        cat1.swimming(30);
        cat1.run(1000);
        cat1.run(1);
        cat1.info();
        dog1.run(30);
        dog1.swimming(30);
        dog1.run(910);
        dog1.run(1);
        dog1.info();
        horse1.run(30);
        horse1.swimming(30);
        horse1.run(70);
        horse1.run(1);
        horse1.info();
    }
}
