package ru.prokhorov.java.basic.otus;

public class Rover implements Transport {
    private int fuel;
    public Rover(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(TerrainTypes terrainTypes, int distance) {
        int fuelRequired = distance;
        if (fuel >= fuelRequired) {
            fuel -= fuelRequired;
            System.out.println("Вездеход проехал " + distance + " по местности: " + terrainTypes
                    + " осталось топлива: " + fuel);
            return true;
        } else {
            System.out.println("У вездехода недостаточно топлива чтобы проехать:  " + distance);
            return false;
        }
    }
}
