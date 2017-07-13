package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        boolean x = a>0 && b>0 && c>0;
        boolean v = (a>0 && b>0 && !(c>0)) || (a>0 && !(b>0) && c>0) || (!(a>0) && b>0 && c>0);
        boolean n = (a>0 && !(b>0) && !(c>0)) || (!(a>0) && b>0 && !(c>0)) || (!(a>0) && !(b>0) && c>0);
        if (x)
            System.out.println("3");
        if (v)
            System.out.println("2");
        if (n)
            System.out.println("1");
        if (!x && !v && !n)
            System.out.println("0");//напишите тут ваш код

    }
}
