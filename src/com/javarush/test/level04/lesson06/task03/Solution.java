package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader ( new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);
        int m1 = min (a, b, c);
        int m2 = max (a, b, c);
        int m3 = srd(m1, m2, a, b, c);

        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m1);
        //напишите тут ваш код
    }
    public static int min (int a, int b, int c)
    {
        if (a<b && a<c)
            return a;
        else
        {
            if (b<a && b<c)
                return b;
            else
                return c;
        }
    }
    public static int max (int a, int b, int c)
    {
        if (a>b && a>c)
            return a;
        else
        {
            if (b>a && b>c)
                return b;
            else
                return c;
        }
    }
    public static int srd (int min, int max, int a, int b, int c)
    {
        int k;
        if (a!=min && a!=max)
        {
            k = a;
            return k;
        }
        else
        {
            if (b != min && b != max)
            {
                k = b;
                return k;
            }
            else
            {
                k = c;
                return k;
            }
        }
    }

}
