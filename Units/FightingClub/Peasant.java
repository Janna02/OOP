package Units.FightingClub;

import java.util.Random;

import Units.BaseUnit;

public class Peasant extends BaseUnit {

    public Peasant(String name) {
        super(name, new Random().nextInt(100, 120), 5);
    }

    @Override
    public String getInfo(){
        return "Крестьянин " + name;
    }
}
