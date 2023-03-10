package Units.FightingClub;

import Units.AttacksOnDistance;

public class CrossBowman extends AttacksOnDistance {

    public CrossBowman(String name) {
        super(name, 3, 2, 3, 10, 4, 6, 16);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name + " (" + "Атака - " + attack + ", Защита - " + defence + ", Дальность выстрела - "
                + shots + ", Урон - " + minDamage + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed
                + ")";
    }

    @Override
    public String getInfoOfMoves() {
        return "Арбалетчик " + name + " (" + "Скорость - " + speed + ", Здоровье - " + hp + ")";
    }
}
