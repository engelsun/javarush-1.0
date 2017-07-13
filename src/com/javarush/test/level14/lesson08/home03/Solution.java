package com.javarush.test.level14.lesson08.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> list = new ArrayList<>();

        label:
        while (true)
        {
            key = reader.readLine();
            switch (key)
            {
                case "user":
                    list.add(key);
                    break;
                case "looser":
                    list.add(key);
                    break;
                case "coder":
                    list.add(key);
                    break;
                case "proger":
                    list.add(key);
                    break;
                default:
                    break label;
            }

        }

        //тут цикл по чтению ключей, пункт 1

            for(int i = 0; i<list.size(); i++)
            {
                String s = list.get(i);
                switch (s)
                {
                    case "user":
                        person = new Person.User();
                        doWork(person);
                        break;
                    case "looser":
                        person = new Person.Looser();
                        doWork(person);
                        break;
                    case "coder":
                        person = new Person.Coder();
                        doWork(person);
                        break;
                    case "proger":
                        person = new Person.Proger();
                        doWork(person);
                        break;
                }
            }
                //создаем объект, пункт 2

         //вызываем doWork


    }

    public static void doWork(Person person)
    {
        if (person instanceof Person.User) ((Person.User) person).live();
        else if (person instanceof Person.Looser) ((Person.Looser) person).doNothing();
        else if (person instanceof Person.Coder) ((Person.Coder) person).coding();
        else if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
        // пункт 3
    }
}
