package Units.FightingClub;

import Units.AttacksOnDistance;

public class Sniper extends AttacksOnDistance {

    public Sniper(String name, int coordinateX, int coordinateY) {
        super(name, 12, 10, 8, 10, 15, 9, 32, coordinateX, coordinateY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d %10s %3d",
                state, "Снайпер", name, "Атака:", attack, "Защита:", defence, "Урон:", minDamage, maxDamage,
                "Здоровье:", hp,
                "Скорость:", speed, "Снарядов:", ammunition);
    }
}
