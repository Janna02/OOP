package Units;

import java.util.Random;
import java.util.ArrayList;

public abstract class BaseUnit implements StepsInfo {

    protected String name, state;
    protected int attack;
    public int defence;
    protected int minDamage;
    protected int maxDamage;
    protected int hp;
    protected int maxHp;
    protected int speed;
    public Coordinates coordinates;

    public BaseUnit(String name, int attack, int defence, int minDamage, int maxDamage, int hp, int speed,
            int coordinateX, int coordinateY) {
        this.name = name;
        this.defence = defence;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        coordinates = new Coordinates(coordinateX, coordinateY);
        this.attack = attack;
        state = "DoesNothing";
    }

    public String toString() {
        return name +
                " Health:" + Math.round(hp) +
                " Defence:" + defence +
                " Attack:" + attack +
                " Damage:" + Math.round(Math.abs((minDamage + maxDamage) / 2)) +
                " Coordinates:" + coordinates.x + "." + coordinates.y;
    }

    public static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(0, Names.values().length)]);
    }

    public int[] getCoordinates() {
        return new int[] { coordinates.getCoordinateX(), coordinates.getCoordinateY() };
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
    public boolean step(ArrayList<BaseUnit> team1, ArrayList<BaseUnit> team2) {
        return true;
    }

    public String getClassUnit() {
        return "null";
    }

    @Override
    public String getInfo() {
        return "null";
    }

    public void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp)
            hp = maxHp;
    }

    protected int findWhoClose(ArrayList<BaseUnit> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > coordinates.getDistance(team.get(i).coordinates) && !team.get(i).state.equals("Die")) {
                index = i;
                min = coordinates.getDistance(team.get(i).coordinates);
            }
        }
        return index;
    }

}
