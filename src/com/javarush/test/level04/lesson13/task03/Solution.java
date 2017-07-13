package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*String s = "8";
    for (int count = 0; count < 10; count++){
        System.out.println(s);
        s = s + 8;
    }
*///or maybe like that
        long b=8;
        int a;

        for(a=0;a<10;a++)
        {
           System.out.println(b);
            b=b*10+8;


        }//напишите тут ваш код

    }
}
