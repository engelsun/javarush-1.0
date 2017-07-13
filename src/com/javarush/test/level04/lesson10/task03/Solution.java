package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));
        String a = r.readLine();
        int b = Integer.parseInt(r.readLine());
        while(b > 0)
        {
            System.out.println(a);
            b--;//условие, которое уменьшает на один, заданное число, после чего программа снова срабатывает, потом снова уменьшает, пока не дойдёт до нуля раз.
        }
        //напишите тут ваш код

    }
}
