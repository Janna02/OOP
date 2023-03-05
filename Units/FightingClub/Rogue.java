package Units.FightingClub;

import java.util.Random;

import Units.FightingClubUnits;

public class Rogue extends FightingClubUnits {

    public Rogue(String name) {
        super(name, new Random().nextInt(100, 200), 5, new Random().nextInt(10, 20));
    }

    @Override
    public String getInfo() {
        return "Разбойник " + name;
    }

}