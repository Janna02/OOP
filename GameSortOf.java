import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Units.BaseUnit;
import Units.FightingClub.*;

public class GameSortOf {

    static final int UNITS = 10;

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        ArrayList<BaseUnit> teamWhiteRock = new ArrayList<>();
        ArrayList<BaseUnit> teamBlackRock = new ArrayList<>();
        ArrayList<BaseUnit> togetherTwoTeams = new ArrayList<>();

        createNewTeam(teamWhiteRock, 0, 1);
        createNewTeam(teamBlackRock, 3, 10);

        togetherTwoTeams.addAll(teamWhiteRock);
        togetherTwoTeams.addAll(teamBlackRock);

        sortNewTeam(togetherTwoTeams);

        System.out.println("Первая команда:");
        showNewTeam(teamWhiteRock);

        System.out.println("Вторая команда:");
        showNewTeam(teamBlackRock);

        System.out.println("Битва:");
        String stop = "";
        while (stop.equals("")) {
            for (BaseUnit hero : togetherTwoTeams) {
                if (teamWhiteRock.contains(hero))
                    hero.step(teamWhiteRock, teamBlackRock);
                else
                    hero.step(teamBlackRock, teamWhiteRock);
            }
            showNewTeam(togetherTwoTeams);
            stop = user_input.nextLine();
            user_input.close();
        }
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



