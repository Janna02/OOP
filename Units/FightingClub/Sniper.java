package Units.FightingClub;

import Units.AttacksOnDistance;

public class Sniper extends AttacksOnDistance {

    public Sniper(String name) {
        super(name, 10, 8, 10, 15, 9, 12, 32);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + name + " (" + "Атака - " + attack + ", Защита - " + defence + ", Дальность выстрела - "
                + shots + ", Урон - " + minDamage + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed
                + ")";
    }

    @Override
    public String getInfoOfMoves() {
        return "Снайпер " + name + " (" + "Скорость - " + speed + ", Здоровье - " + hp + ")";
    }
}
