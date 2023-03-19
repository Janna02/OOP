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
        if (state.equals("Die") || ammunition == 0)
            return false;
        BaseUnit target = blackRock.get(findWhoClose(blackRock));
        float damage = (target.defence - attack) > 0 ? minDamage
                : (target.defence - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        target.getDamage(damage);
        for (BaseUnit hero : whiteRock) {
            if (hero.getClassUnit().equals("Крестьянин") && hero.state.equals("DoesNothing")) {
                hero.state = "Busy";
                ammunition++;
                break;
            }
        }
        ammunition--;
        return true;
    }
}