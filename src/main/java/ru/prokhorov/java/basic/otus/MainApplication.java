package ru.prokhorov.java.basic.otus;

public class MainApplication {
    public static void main(String[] args) {
        Human human1 = new Human("Максим");
        Car car1 = new Car(1000);
        Horse horse1 = new Horse(100);
        Bicycle bicycle1 = new Bicycle();
        Rover rover1 = new Rover(1000);

        human1.setCurrentTransport(car1);
        human1.move(TerrainTypes.DENSE_FOREST, 999);
        human1.move(TerrainTypes.PLAIN, 999);
        human1.move(TerrainTypes.PLAIN, 999);
        human1.removedCurrentTransport();
        human1.removedCurrentTransport();
        human1.move(TerrainTypes.DENSE_FOREST, 999);
        human1.setCurrentTransport(horse1);
        human1.move(TerrainTypes.SWAMP, 99);
        human1.move(TerrainTypes.PLAIN, 99);
        human1.removedCurrentTransport();
        human1.setCurrentTransport(bicycle1);
        human1.move(TerrainTypes.DENSE_FOREST,50);
        human1.removedCurrentTransport();
        human1.setCurrentTransport(rover1);
        human1.move(TerrainTypes.SWAMP,800);
    }
}
