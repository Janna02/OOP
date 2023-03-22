package Units;

import java.util.ArrayList;

public class AttacksByMagic extends BaseUnit {

    protected int mana;

    public AttacksByMagic(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed,
            int mana,
            int coordinateX,
            int coordinateY) {
        super(name, attack, defense, minDamage, maxDamage, hp, speed, coordinateX, coordinateY);
        this.mana = mana;
    }

    public String toString() {
        return name +
                " Health:" + Math.round(hp) +
                " Defence:" + defence +
                " Attack:" + attack +
                " Damage:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " Coordinates:" + coordinates.x + "." + coordinates.y +
                " Mana:" + mana;
    }

    @Override
    public boolean step(ArrayList<BaseUnit> whiteRock, ArrayList<BaseUnit> blackRock) {
        if (state.equals("Die"))
            return false;
        if (mana > 0) {
            BaseUnit target = findMostWounded(whiteRock);
            target.getDamage(minDamage);
            mana--;
        }
        return true;
    }

    protected BaseUnit findMostWounded(ArrayList<BaseUnit> whiteRock) {
        double minHp = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < whiteRock.size(); i++) {
            BaseUnit target = whiteRock.get(i);
            if (minHp > target.maxHp - target.hp) {
                index = i;
                minHp = target.maxHp - target.hp;
            }
        }
        return whiteRock.get(index);
    }
}