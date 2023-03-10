package Units;

import java.util.Random;

public abstract class BaseUnit implements StepsInfo {

    protected String name;
    protected int defence, minDamage, maxDamage, hp, maxHp, speed;

    public BaseUnit(String name, int defence, int minDamage, int maxDamage, int hp, int speed) {
        this.name = name;
        this.defence = defence;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public String getInfoOfMoves() {
        return "";
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "null";
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

}
