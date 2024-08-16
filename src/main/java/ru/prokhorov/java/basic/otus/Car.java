package ru.prokhorov.java.basic.otus;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(TerrainTypes terrainTypes, int distance) {
        if (terrainTypes == TerrainTypes.DENSE_FOREST || terrainTypes == TerrainTypes.SWAMP) {
            System.out.println("Машина не может пройти по местности: " + terrainTypes);
            return false;
        }
        int fuelRequired = distance;
        if (fuel >= fuelRequired){
            fuel -= fuelRequired;
            System.out.println("Машина проехала: " + distance + " по местности " + terrainTypes +
                    " осталось топлива " + fuel);
            return true;
        } else {
            System.out.println("У машины недостаточно топлива чтобы проехать:  " + distance);
            return false;
        }

    }
}
