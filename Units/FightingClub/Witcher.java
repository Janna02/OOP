package Units.FightingClub;

import java.util.Random;

import Units.AttacksByMagic;

public class Witcher extends AttacksByMagic {

    public Witcher(String name) {
        super(name, new Random().nextInt(100, 150), 5, new Random().nextInt(10, 30));
    }

    @Override
    public String getInfo(){
        return "Колдун " + name;
    }
}
