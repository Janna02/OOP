package Units.FightingClub;

import Units.BaseUnit;

public class Rogue extends BaseUnit {

    public Rogue(String name, int coordinateX, int coordinateY) {
        super(name, 8, 3, 2, 4, 10, 6, coordinateX, coordinateY);
    }

    @Override
    public String getInfo() {
        return "Бандит " + name + " (" + "Атака - " + attack + ", Защита - " + defence + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }
}