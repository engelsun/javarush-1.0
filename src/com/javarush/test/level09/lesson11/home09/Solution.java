package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> m = new HashMap<String, Cat>();

        Cat cat1 = new Cat("Кот1");
        Cat cat2 = new Cat("Кот2");
        Cat cat3 = new Cat("Кот3");
        Cat cat4 = new Cat("Кот4");
        Cat cat5 = new Cat("Кот5");
        Cat cat6 = new Cat("Кот6");
        Cat cat7 = new Cat("Кот7");
        Cat cat8 = new Cat("Кот8");
        Cat cat9 = new Cat("Кот9");
        Cat cat10 = new Cat("Кот10");
        m.put("Кот1", cat1);
        m.put("Кот2", cat2);
        m.put("Кот3", cat3);
        m.put("Кот4", cat4);
        m.put("Кот5", cat5);
        m.put("Кот6", cat6);
        m.put("Кот7", cat7);
        m.put("Кот8", cat8);
        m.put("Кот9", cat9);
        m.put("Кот10", cat10);
        return m;
        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        HashSet<Cat> s = new HashSet<Cat>();
        for(Map.Entry<String, Cat> b : map.entrySet())
        {
            s.add(b.getValue());
        }
        return s;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat.name);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
