package Units.FightingClub;

import java.util.ArrayList;
import Units.BaseUnit;
import Units.Coordinates;

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

    @Override
    public String getClassUnit() {
        return "Копейщик";
    }

    @Override
    public boolean step(ArrayList<BaseUnit> whiteRock, ArrayList<BaseUnit> blackRock) {

        if (state.equals("Die"))
            return false;

        BaseUnit target = blackRock.get(findWhoClose(blackRock));

        if (target.coordinates.getDistance(coordinates) < 2) {
            float damage = 0;
            if (target.defence - attack > 0)
                damage = minDamage;
            else if (target.defence - attack < 0)
                damage = maxDamage;
            else
                damage = (minDamage + maxDamage) / 2;
            target.getDamage(damage);
        } else {
            Coordinates tempvc = coordinates.chooseWay(target.coordinates);
            if (Math.abs(tempvc.x) < Math.abs(tempvc.y)) {
                if (coordinates.chooseWay(target.coordinates).y > 0) {
                    coordinates.y--;
                } else {
                    coordinates.y++;
                }
            } else {
                if (coordinates.chooseWay(target.coordinates).x > 0) {
                    coordinates.x--;
                } else {
                    coordinates.x++;
                }
            }
        }
        return true;
    }
}
