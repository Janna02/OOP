package Units.FightingClub;

import java.util.ArrayList;
import Units.*;

public class Rogue extends BaseUnit {

    public Rogue(String name, int coordinateX, int coordinateY) {
        super(name, 8, 3, 2, 4, 10, 6, coordinateX, coordinateY);
    }

    @Override
    public String getInfo() {
        return "Бандит " + name + " (" + "Атака - " + attack + ", Защита - " + defence + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }

    @Override
    public String getClassUnit() {
        return "Разбойник";
    }

    @Override
    public boolean step(ArrayList<BaseUnit> whiteRock, ArrayList<BaseUnit> blackRock) {

        if (state.equals("Die"))
            return false;

        BaseUnit target = blackRock.get(findWhoClose(blackRock));

        if (target.coordinates.getDistance(coordinates) < 2) {
            float damage = (target.defence - attack) > 0 ? minDamage
                    : (target.defence - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
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