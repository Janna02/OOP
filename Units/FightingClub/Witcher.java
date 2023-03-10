package Units.FightingClub;

import Units.AttacksByMagic;

public class Witcher extends AttacksByMagic {

    public Witcher(String name) {
        super(name, 12, -5, -5, 30, 9, 1);
    }

    @Override
    public String getInfo() {
        return "Колдун " + name + " (" + "Защита - " + defence + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Магия - " + magic + ")";
    }

    @Override
    public String getInfoOfMoves() {
        return "Колдун " + name + " (" + "Скорость - " + speed + ", Здоровье - " + hp + ")";
    }
}
