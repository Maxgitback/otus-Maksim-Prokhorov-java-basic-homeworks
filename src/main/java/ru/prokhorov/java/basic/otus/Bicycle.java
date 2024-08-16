package ru.prokhorov.java.basic.otus;

public class Bicycle implements Transport {
    @Override
    public boolean move(TerrainTypes terrainTypes, int distance) {
        if (terrainTypes == TerrainTypes.SWAMP) {
            System.out.println("Велосипед не может пройти по местности: " + terrainTypes);
            return false;
        } else {
            System.out.println("Велосипед проехал " + distance + " по местности: " + terrainTypes);
            return true;
        }
    }
}
