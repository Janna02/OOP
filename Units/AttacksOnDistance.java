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
    public void step(ArrayList<BaseUnit> whiteRock, ArrayList<BaseUnit> blackRock) {
        if (state.equals("Die") || (ammunition == 0))
            return;
        BaseUnit target = blackRock.get(findWhoClose(blackRock));
        float damage = (target.defence - attack) > 0 ? minDamage
                : (target.defence - attack) < 0 ? maxDamage : (minDamage + maxDamage) / 2;
        target.getDamage(damage);
        for (BaseUnit unit : whiteRock) {
            if (unit.getInfo().split(" ")[0].equals("Крестьянин") && unit.state.equals("DoNothing"))
                ;
            unit.state = "Busy";
            return;
        }
        ammunition--;
    }
}