package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
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
        if (a>20)
            System.out.println("И 18-ти достаточно");//напишите тут ваш код

    }
}
