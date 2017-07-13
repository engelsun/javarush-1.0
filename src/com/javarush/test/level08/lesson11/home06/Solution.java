package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(new Human("boy1",true,12,new ArrayList<Human>()));
        ch.add(new Human("boy2",true,11,new ArrayList<Human>()));
        ch.add(new Human("girl",true,13,new ArrayList<Human>()));
        Collections.addAll(ch);

        ArrayList<Human> p = new ArrayList<Human>();
        p.add(new Human("dade",true,45,ch));
        p.add(new Human("mom",false,41,ch));
        Collections.addAll(p);

        ArrayList<Human> gp = new ArrayList<Human>();
        gp.add(new Human("gdade",true, 78, p));
        gp.add(new Human("gdade",true, 87, p));
        gp.add(new Human("gmam",false, 64, p));
        gp.add(new Human("gmam",false, 65, p));
        Collections.addAll(gp);

        ArrayList<Human> f = new ArrayList<Human>();
        f.addAll(gp);
        f.addAll(p);
        f.addAll(ch);

        for (int i = 0; i < f.size(); i++) System.out.println(f.get(i));
        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList <Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
