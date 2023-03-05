package Units;
import java.util.Random;

public abstract class AttacksOnDistance extends FightingClubUnits {

    protected int shots, maxShots;

    public AttacksOnDistance(String name, int shots, int maxShots) {

        super(name, new Random().nextInt(100, 130), 5, new Random().nextInt(10, 30));
        this.shots = shots;
        this.maxShots = maxShots;
    }
}