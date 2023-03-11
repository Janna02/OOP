package Units.FightingClub;

import Units.FightingClubUnits;

public class Peasant extends FightingClubUnits {

    int delivery;

    public Peasant(String name) {
        super(name, 1, 1, 1, 1, 3, 1);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + name + " (" + "Атака - " + attack + ", Защита - " + defence + ", Урон - " + minDamage
                + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Доставка - " + delivery + ")";
    }

    @Override
    public String getInfoOfMoves() {
        return "Крестьянин " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }
}
