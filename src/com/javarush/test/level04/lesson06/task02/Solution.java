package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);
        String d1 = reader.readLine();
        int d = Integer.parseInt(d1);
        if (a>b && a>c && a>d)
            System.out.println(a);
        if (b>a && b>c && b>d)
            System.out.println(b);
        if (c>a && c>b && c>d)
            System.out.println(c);
        if (d>a && d>b && d>c)
            System.out.println(d);//напишите тут ваш код

    }
}
