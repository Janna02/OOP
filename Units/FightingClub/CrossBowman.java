package Units.FightingClub;

import Units.AttacksOnDistance;

public class CrossBowman extends AttacksOnDistance {

    public CrossBowman(String name) {
        super(name, 3, 3);
    }

    public String getInfo(){
        return "Арбалетчик " + name;
    }
}
