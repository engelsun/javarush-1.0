package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandpa1 = new Human("Grandpa1", true, 90, null, null);
        Human grandpa2 = new Human("Grandpa2", true, 97, null, null);
        Human granny1 = new Human("Granny1", false, 89, null, null);
        Human granny2 = new Human("Granny2", false, 88, null, null);
        Human father = new Human("Father", true, 67, grandpa1, granny1);
        Human mother = new Human("Mother", false, 50, grandpa2, granny2);
        Human child1 = new Human("Child1", true, 20, father, mother);
        Human child2 = new Human("Child2", false, 19, father, mother);
        Human child3 = new Human("Child3", true, 18, father, mother);

        ArrayList<Human> s = new ArrayList<Human>();
        Collections.addAll(s, grandpa1, grandpa2, granny1, granny2, father, mother, child1, child2, child3);

        for (int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));//напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
