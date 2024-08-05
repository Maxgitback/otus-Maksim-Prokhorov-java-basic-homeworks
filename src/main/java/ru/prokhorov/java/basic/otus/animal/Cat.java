package ru.prokhorov.java.basic.otus.animal;
public class Cat extends Animal {
    public Cat(String name, int runningSpeed, int swimmingSpeed,int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }
    @Override
    public int swimming(int distance) {
        System.out.println("Кот плавать не умеет");
        return -1;
    }
}
