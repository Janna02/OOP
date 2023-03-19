
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Units.BaseUnit;
import Units.FightingClub.*;

public class GameSortOf {

    static final int UNITS = 10;
    public static ArrayList<BaseUnit> white = new ArrayList<>();
    public static ArrayList<BaseUnit> black = new ArrayList<>();
    public static ArrayList<BaseUnit> both = new ArrayList<>();

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.print("Нажмите 'Enter' для старта игры:");
        user_input.nextLine();

        createNewTeam(white, 0, 1);
        createNewTeam(black, 3, 10);

        both.addAll(white);
        both.addAll(black);

        sortNewTeam(both);

        System.out.println("Первая команда:");
        showNewTeam(white);

        System.out.println("Вторая команда:");
        showNewTeam(black);

        System.out.println("Битва:");

        int countWhite = 0;
        int countBlack = 0;
        while (true) {
            ConsoleView.view();
            user_input.nextLine();
            countWhite = 0;
            countBlack = 0;

            for (BaseUnit unit : both) {
                if (white.contains(unit)) {
                    if (unit.step(white, black) == true)
                        unit.step(white, black);
                    else
                        countWhite++;
                } else {
                    if (unit.step(black, white) == true)
                        unit.step(black, white);
                    else
                        countBlack++;
                }
            }
            if (countWhite == UNITS || countBlack == UNITS) {
                break;
            }
        }

        if (countWhite == UNITS)
            System.out.println("Победили черные");
        else
            System.out.println("Победили белые");
        user_input.close();
    }

    static void showNewTeam(ArrayList<BaseUnit> team) {
        team.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("----------------------------------------------------------------------------------------");
    }

    static void sortNewTeam(ArrayList<BaseUnit> team) {
        team.sort(new Comparator<BaseUnit>() {
            @Override
            public int compare(BaseUnit unit1, BaseUnit unit2) {
                if (unit2.getSpeed() == unit1.getSpeed())
                    return unit2.getHp() - unit1.getHp();
                else {
                    return unit2.getSpeed() - unit1.getSpeed();
                }
            }
        });
    }

    static void createNewTeam(ArrayList<BaseUnit> team, int offset, int coordinateX) {
        for (int i = 1; i <= UNITS; i++) {
            switch (new Random().nextInt(4) + offset) {
                case 0:
                    team.add(new LanceKnight(LanceKnight.getName(), coordinateX, i));
                    break;
                case 1:
                    team.add(new CrossBowman(CrossBowman.getName(), coordinateX, i));
                    break;
                case 2:
                    team.add(new Monk(Monk.getName(), coordinateX, i));
                    break;
                case 3:
                    team.add(new Peasant(Peasant.getName(), coordinateX, i));
                    break;
                case 4:
                    team.add(new Rogue(Rogue.getName(), coordinateX, i));
                    break;
                case 5:
                    team.add(new Sniper(Sniper.getName(), coordinateX, i));
                    break;
                case 6:
                    team.add(new Witcher(Witcher.getName(), coordinateX, i));
                    break;
                default:
                    break;
            }
        }
    }

}
