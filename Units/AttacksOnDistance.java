package Units;

import java.util.ArrayList;

public abstract class AttacksOnDistance extends BaseUnit {

    protected int ammunition;

    public AttacksOnDistance(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed,
            int ammunition,
            int coordinateX, int coordinateY) {
        super(name, attack, defense, minDamage, maxDamage, hp, speed, coordinateX, coordinateY);
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return name +
                " Health:" + Math.round(hp) +
                " Defence:" + defence +
                " Attack:" + attack +
                " Damage:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " Coordinates:" + coordinates.x + "." + coordinates.y +
                " Ammo: " + ammunition;
    }

    @Override
    public boolean step(ArrayList<BaseUnit> whiteRock, ArrayList<BaseUnit> blackRock) {
        if (state.equals("Die"))
            return false;
        if (ammunition > 0) {
            BaseUnit target = blackRock.get(findWhoClose(blackRock));
            float damage = 0;
            if (target.defence - attack > 0)
                damage = minDamage;
            else if (target.defence - attack < 0)
                damage = maxDamage;
            else
                damage = (minDamage + maxDamage) / 2;
            target.getDamage(damage);
            for (BaseUnit unit : whiteRock) {
                if (unit.getClassUnit().equals("Крестьянин") && !unit.state.equals("Die")) {
                    unit.state = "Busy";
                    ammunition++;
                    break;
                }
            }
            ammunition--;
        }
        return true;
    }
}