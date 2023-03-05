// Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
// Для каждого сформировать список свойств и возможных действий.
// Например  свойство скорость, действие нанести удар. 
// Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства
// и действия имеющиеся у всех персонажей. Создать этот класс.
// Создать классы для каждого типа персонажей наследующие
// и расширяющие абстрактный(обобщённый) класс.
// В основной программе создать по одному экземпляру каждого типа персонажей.

import java.util.ArrayList;

import Units.BaseUnit;
import Units.FightingClub.*;

public class GameSortOf {
    public static void main(String[] args) {

        ArrayList<BaseUnit> GameUnit = new ArrayList<>();

        GameUnit.add(new Sniper(Sniper.getName()));
        GameUnit.add(new CrossBowman(CrossBowman.getName()));
        GameUnit.add(new Rogue(Rogue.getName()));
        GameUnit.add(new LanceKnight(LanceKnight.getName()));
        GameUnit.add(new Monk(Monk.getName()));
        GameUnit.add(new Witcher(Witcher.getName()));
        GameUnit.add(new LanceKnight(LanceKnight.getName()));
        GameUnit.add(new Monk(Monk.getName()));
        GameUnit.add(new Peasant(Peasant.getName()));
        GameUnit.add(new CrossBowman(CrossBowman.getName()));
        GameUnit.add(new Peasant(Peasant.getName()));

        GameUnit.forEach(n -> System.out.println(n.getInfo()));

    }

}
