package Units;

import java.util.ArrayList;

public class AttacksByMagic extends BaseUnit {

    protected int mana;

    public AttacksByMagic(String name, int attack, int defense, int minDamage, int maxDamage, int hp, int speed,
            int mana,
            int pointX,
            int pointY) {
        super(name, attack, defense, minDamage, maxDamage, hp, speed, pointX, pointY);
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<BaseUnit> whiteRock, ArrayList<BaseUnit> blackRock) {
        if (state.equals("Die") || mana <= 0)
            return;
        BaseUnit target = findMostWounded(whiteRock);
        target.getDamage(minDamage);
        mana--;

        if (mana <= 0)
            mana += 5;
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