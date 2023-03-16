package Units;

import java.util.ArrayList;

public interface StepsInfo {

    void step(ArrayList<BaseUnit> team1, ArrayList<BaseUnit> team2);

    String getInfo();
}