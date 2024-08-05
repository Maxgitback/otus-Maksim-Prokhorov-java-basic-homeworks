package ru.prokhorov.java.basic.otus.animal;

public class Dog extends Animal {
    public Dog(String name, int runningSpeed, int swimmingSpeed,int stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }
    @Override
    public int swimming(int distance) {
        int calculation = 2 * distance;
        if (stamina >= calculation) {
            stamina -= calculation;
            System.out.println(name + " Плывет затратив выносливость в размере " + calculation +
                    "\nу" + name + " осталось выносливости: " + stamina);
            return calculation;
        } else {
            System.out.println("У " + name + " закончилась выносливость");
        }
        if (stamina == 0) {
            System.out.println("у животного " + name + " появилось состояние усталости");
        }
        return -1;
    }
}
