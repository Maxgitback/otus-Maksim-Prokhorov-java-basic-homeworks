package ru.prokhorov.java.basic.otus;

public class Box {
    private final int width;
    private final int height;
    private String inside;
    private String color;
    private boolean open;
    public String getInside() {
        return inside;
    }
    public void setInside(String inside) {
        this.inside = inside;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки изменён на: " + color);
    }
    public boolean isOpen() {
        return open;
    }
    public Box(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.inside = null;
        this.color = color;
        this.open = false;
    }
    public void itOpens() {
        if (!open) {
            open = true;
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка уже была открыта");
        }
    }
    public void itsClosing() {
        if (open) {
            open = false;
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка уже была закрыта");
        }
    }
    public void info() {
        System.out.println("Размер коробки: " + width + " " + height +
                "\nВнутри коробки: " + inside + "\nЦвет коробки: " + color + "\nСостояние коробки: " + open);
    }
    public void folding(String addItem) {
        if (open) {
            if (inside == null) {
                inside = addItem;
                System.out.println(" Предмет " + addItem + " добавлен в коробку");
            } else {
                System.out.println("В коробке уже есть предмет: " + inside);
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }
    public void throwItAway() {
        if (open) {
            if (inside != null) {
                inside = null;
                System.out.println(" Предмет удален из коробки " + inside);
            } else {
                System.out.println("В коробке пусто");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }

}

