package ru.prokhorov.java.basic.otus;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }
    public void setCurrentTransport (Transport transport) {
        this.currentTransport = transport;
        if (transport instanceof Car) {
            System.out.println(name + " сел в машину");
        } else if (transport instanceof Horse) {
            System.out.println(name + " сел на лошадь");
        } else if (transport instanceof Bicycle) {
            System.out.println(name + " сел на велосипед");
        } else if (transport instanceof Rover) {
            System.out.println(name + " сел в вездеход");
        }
    }
    public void removedCurrentTransport() {
        if (this.currentTransport != null) {
            this.currentTransport = null;
            System.out.println(name + " слез с транспорта");
        } else {
            System.out.println(name + " не использует транспорт");
        }
    }
    public void move (TerrainTypes terrainTypes, int distance)  {
        if (currentTransport != null) {
            boolean success = currentTransport.move(terrainTypes, distance);
            if (!success) {
                System.out.println(name + " не может пройти по местности: " + terrainTypes);
            }
        } else {
            System.out.println(name + " прошел пешком " + distance + " по местности " + terrainTypes);
        }
    }



}
