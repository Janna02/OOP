package Units.FightingClub;

import java.util.Random;

import Units.FightingClubUnits;

public class LanceKnight extends FightingClubUnits {

    public LanceKnight(String name) {
        super(name, new Random().nextInt(180, 200), 10, new Random().nextInt(10, 20));
    }

    @Override
    public String getInfo() {
        return "Копейщик " + name;
    }

}
