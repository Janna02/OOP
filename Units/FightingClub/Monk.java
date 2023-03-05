package Units.FightingClub;

import java.util.Random;

import Units.AttacksByMagic;

public class Monk extends AttacksByMagic {

    public Monk(String name) {
        super(name, new Random().nextInt(100, 130), 5, new Random().nextInt(10, 30));
    }

    @Override
    public String getInfo(){
        return "Монах " + name;
    }
}
