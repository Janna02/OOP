package Units;

public abstract class FightingClubUnits extends BaseUnit {

    protected int attack;

    public FightingClubUnits(String name, int defence, int minDamage, int maxDamage, int hp, int speed, int attack) {
        super(name, defence, minDamage, maxDamage, hp, speed);
        this.attack = attack;
    }
}