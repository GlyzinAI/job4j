package ru.job4j.hero.people;

import ru.job4j.hero.Banda;
import ru.job4j.hero.BaseHero;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Class AllPeople.
 *
 * @author Artur Glyzin.
 * @version 1.0.
 * @since 31.08.2018.
 */

public class AllPeople {
    public ArrayList<BaseHero> people() {
        ArrayList<BaseHero> people = new ArrayList<>();
        people.add(new ArcherPeople());
        people.add(new ArcherPeople());
        people.add(new ArcherPeople());
        people.add(new WarriorPeople());
        people.add(new WarriorPeople());
        people.add(new WarriorPeople());
        people.add(new WarriorPeople());
        people.add(new MagPeople());

        return people;
    }
}
