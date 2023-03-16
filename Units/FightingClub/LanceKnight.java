package Units.FightingClub;

import Units.BaseUnit;

public class LanceKnight extends BaseUnit {

    public LanceKnight(String name, int coordinateX, int coordinateY) {
        super(name, 4, 5, 1, 3, 10, 4, coordinateX, coordinateY);
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d",
                state, "Копейщик", name, "Атака:", attack, "Защита:", defence, "Урон:", minDamage, maxDamage,
                "Здоровье:", hp,
                "Скорость:", speed);
    }
}
