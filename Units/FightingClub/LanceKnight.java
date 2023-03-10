package Units.FightingClub;

import Units.FightingClubUnits;

public class LanceKnight extends FightingClubUnits {

    public LanceKnight(String name) {
        super(name, 5, 1, 3, 10, 4, 4);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + name + " (" + "Атака - " + attack + ", Защита - " + defence + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }

    @Override
    public String getInfoOfMoves() {
        return "Копейщик " + name + " (" + "Скорость - " + speed + ", Здоровье - " + hp + ")";
    }

}
