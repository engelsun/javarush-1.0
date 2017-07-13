package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        String a3 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);
        int c = Integer.parseInt(a3);
        if (a==b && b!=c)
            System.out.println(3);
        if (a==c && b!=c)
            System.out.println(2);
        if (b==c && a!=c)
            System.out.println(1);
        //напишите тут ваш код

    }
}
