package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        int a = Integer.parseInt(a2);
        if (a<18)
        System.out.println("Подрасти еще");//напишите тут ваш код

    }
}
