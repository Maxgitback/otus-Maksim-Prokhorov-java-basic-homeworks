package ru.prokhorov.java.basic.otus;

public class Horse implements Transport {
    private int stamina;
    public Horse (int stamina) {
        this.stamina = stamina;
    }
    @Override
    public boolean move(TerrainTypes terrainTypes, int distance) {
        if (terrainTypes == TerrainTypes.SWAMP) {
            System.out.println("Лошадь не может пройти по местности: " + terrainTypes);
            return false;
        }
        int staminaRequired = distance;
        if (stamina >= staminaRequired){
            stamina -= staminaRequired;
            System.out.println("Лошадь проехала: " + distance + " по местности " + terrainTypes +
                    " осталось энергии " + stamina);
            return true;
        } else {
            System.out.println("У лошади недостаточно энергии чтобы проехать:  " + distance);
            return false;
        }

    }
}
