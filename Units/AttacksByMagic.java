package Units;

public class AttacksByMagic extends BaseUnit {

    protected int mana;

    public AttacksByMagic(String name, int hp, int def, int mana) {

        super(name, hp, def);
        this.mana = mana;
    }
}