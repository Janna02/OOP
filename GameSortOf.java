// Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
// Для каждого сформировать список свойств и возможных действий.
// Например  свойство скорость, действие нанести удар. 
// Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства
// и действия имеющиеся у всех персонажей. Создать этот класс.
// Создать классы для каждого типа персонажей наследующие
// и расширяющие абстрактный(обобщённый) класс.
// В основной программе создать по одному экземпляру каждого типа персонажей.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.BaseUnit;
import Units.FightingClub.*;

public class GameSortOf {
    public static void main(String[] args) {
        ArrayList<BaseUnit> TeamFirst = new ArrayList<>();
        ArrayList<BaseUnit> TeamSecond = new ArrayList<>();
        ArrayList<BaseUnit> Moves = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    TeamFirst.add(new LanceKnight(LanceKnight.getName()));
                    break;
                case 1:
                    TeamFirst.add(new CrossBowman(CrossBowman.getName()));
                    break;
                case 2:
                    TeamFirst.add(new Monk(Monk.getName()));
                    break;
                case 3:
                    TeamFirst.add(new Peasant(Peasant.getName()));
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    TeamSecond.add(new Rogue(Rogue.getName()));
                    break;
                case 1:
                    TeamSecond.add(new Sniper(Sniper.getName()));
                    break;
                case 2:
                    TeamSecond.add(new Witcher(Witcher.getName()));
                    break;
                case 3:
                    TeamSecond.add(new Peasant(Peasant.getName()));
                    break;
                default:
                    break;
            }
        }

        System.out.println("Первая команда:");
        TeamFirst.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("____________________________________________");

        System.out.println("Вторая команда:");
        TeamSecond.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("_____________________________________________");

        Moves.addAll(TeamFirst);
        Moves.addAll(TeamSecond);

        Moves.sort(new Comparator<BaseUnit>() {

            @Override
            public int compare(BaseUnit hero1, BaseUnit hero2) {
                if (hero2.getSpeed() == hero1.getSpeed())
                    return hero2.getHp() - hero1.getHp();
                else {
                    return hero2.getSpeed() - hero1.getSpeed();
                }
            }
        });

        System.out.println("Ходы игроков:");
        Moves.forEach(n -> System.out.println(n.getInfoOfMoves()));
    }

}
