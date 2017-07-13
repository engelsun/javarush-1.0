package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String Name = reader.readLine();
        String sAge1 = reader.readLine();
        String sAge2 = reader.readLine();
        int money = Integer.parseInt(sAge1);
        int ages = Integer.parseInt(sAge2);
        System.out.println(Name + " " + "получает" + " " + money + " " + "через" + " " + ages + " " + "лет.");
        //напишите тут ваш код

    }
}