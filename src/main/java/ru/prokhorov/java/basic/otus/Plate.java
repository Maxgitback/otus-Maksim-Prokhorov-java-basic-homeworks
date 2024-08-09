package ru.prokhorov.java.basic.otus;

import java.util.Scanner;

public class Plate {
    private int maxAmountFood;
    private int currentAmountFood;
    public int getMaxAmountFood() {
        return maxAmountFood;
    }
    public int getCurrentAmountFood() {
        return currentAmountFood;
    }
    public Plate(int maxAmountFood) {
        this.maxAmountFood = maxAmountFood;
        this.currentAmountFood = maxAmountFood;
    }
    public void info() {
        System.out.println("информация по содержанию тарелки: " + maxAmountFood + " " + currentAmountFood);
    }
    public void addFood(int add) {
        if (currentAmountFood + add <= maxAmountFood) {
            currentAmountFood += add;
            System.out.println("В тарелку добавлена еда:" + currentAmountFood);
        } else {
            System.out.println("Тарелка переполнена:" + currentAmountFood);
        }
    }
    public boolean subtractFood(int amount) {
        if (currentAmountFood - amount >= 0) {
            currentAmountFood -= amount;
            System.out.println("Уменьшили кол-во еды на: " + amount + "\nСейчас еды в тарелке " + currentAmountFood);
            return true;
        } else {
            System.out.println("Еды в тарелке не может быть меньше 0");
            return false;
        }
    }
}
