package Units;

public abstract class AttacksOnDistance extends FightingClubUnits {

    protected int shots;

    public AttacksOnDistance(String name, int defence, int minDamage, int maxDamage, int hp, int speed, int attack, int shots) {
        super(name, defence, minDamage, maxDamage, hp, speed, attack);
        this.shots = shots;
    }
}