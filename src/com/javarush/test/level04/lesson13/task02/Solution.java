package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        int m = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());
        int a;
        int b;
        for(b = 0; b < m; b++)//m - conformity to quantity of lines
        {
            for(a=0; a<n; a++)//n-отвечает за количество "8" в строке
                System.out.print(8);
            System.out.println();


        }

        //напишите тут ваш код

    }
}
