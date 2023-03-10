package Units.FightingClub;

import Units.AttacksByMagic;

public class Monk extends AttacksByMagic {

    public Monk(String name) {
        super(name, 7, -4, -4, 30, 5, 1);
    }

    @Override
    public String getInfo() {
        return "Монах " + name + " (" + "Защита - " + defence + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Магия - " + magic + ")";
    }

    @Override
    public String getInfoOfMoves() {
        return "Монах " + name + " (" + "Скорость - " + speed + ", Здоровье - " + hp + ")";
    }
}
