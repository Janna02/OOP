package Units.FightingClub;

import Units.AttacksOnDistance;

public class CrossBowman extends AttacksOnDistance {

    public CrossBowman(String name, int coordinateX, int coordinateY) {
        super(name, 6, 3, 2, 3, 10, 4, 16, coordinateX, coordinateY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d %10s %3d",
        state, "Арбалетчик", name, "Атака:", attack, "Защита:", defence, "Урон:", minDamage, maxDamage, "Здоровье:", hp,
        "Скорость:", speed, "Снарядов:", ammunition);
    }
}
