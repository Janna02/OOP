package Units.FightingClub;

import Units.AttacksOnDistance;

public class Sniper extends AttacksOnDistance {

    public Sniper(String name) {
        super(name,  5, 5);
    }

    public String getInfo(){
        return "Снайпер " + name;
    }
}
