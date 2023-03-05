package Units;


import java.util.Random;

public abstract class FightingClubUnits extends BaseUnit {

    protected int attack;

    public FightingClubUnits(String name, int hp, int def, int attack){
        super(name, hp, def);
        this.attack = attack;
    }

    public void Attack(BaseUnit target) {
        int damage = new Random().nextInt(10, 20);
        target.GetDamage(damage);
    }
}