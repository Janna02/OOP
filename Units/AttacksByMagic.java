package Units;

public class AttacksByMagic extends BaseUnit {

    protected int magic;

    public AttacksByMagic(String name, int defence, int minDamage, int maxDamage, int hp, int speed, int magic) {
        super(name, defence, minDamage, maxDamage, hp, speed);
        this.magic = magic;
    }
}