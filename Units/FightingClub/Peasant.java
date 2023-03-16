package Units.FightingClub;

import Units.BaseUnit;
import java.util.ArrayList;

public class Peasant extends BaseUnit {

    int delivery;

    public Peasant(String name, int coordinateX, int coordinateY) {
        super(name, 1, 1, 1, 1, 1, 3, coordinateX, coordinateY);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format("%7S %10s %13s %7s %3d %10s %3d %7s %2d %2d %10s %3d %10s %3d",
                state, "Крестьянин", name, "Атака:", attack, "Защита:", defence, "Урон:", minDamage, maxDamage,
                "Здоровье:", hp,
                "Скорость:", speed);
    }

    @Override
    public void step(ArrayList<BaseUnit> whiteRock, ArrayList<BaseUnit> blackRock) {
        if (!state.equals("Die"))
            state = "DoesNothing";
    }
}
