package ru.prokhorov.java.basic.otus;

public class MainApplication {
    public static void main(String[] args) {
        Plate plate1 = new Plate(100);
        Cat[] cats = {
                new Cat("Barsik", 25),
                new Cat("Boris", 25),
                new Cat("Filimon", 25),
                new Cat("Jirok", 50)
        };
        plate1.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
        }
        plate1.addFood(75);
        for (int i = 3; i < cats.length; i++) {
            cats[i].eat(plate1);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}
