package Units.FightingClub;

import Units.FightingClubUnits;

public class Rogue extends FightingClubUnits {

    public Rogue(String name) {
        super(name, 3, 2, 4, 10, 6, 8);
    }

    @Override
    public String getInfo() {
        return "Бандит " + name + " (" + "Атака - " + attack + ", Защита - " + defence + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }

    @Override
    public String getInfoOfMoves() {
        return "Бандит " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }

}