package ru.prokhorov.java.basic.otus;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("Сытость " + name + " = " + ((satiety) ? "сытый" : "голодный"));
    }
    public void eat (Plate plate){
        if (plate.subtractFood(appetite)) {
            satiety = true;
            System.out.println(name + " покушал и теперь сыт");
        } else {
            System.out.println(name + "не смог покушать и голоден");
        }
    }
}
