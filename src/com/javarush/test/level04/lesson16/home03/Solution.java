package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader r = new BufferedReader (new InputStreamReader(System.in));

        int v = 0;

        while (true)
        {
            String s = r.readLine();
            int a = Integer.parseInt(s);
            v = v + a;
            if (s.equals("-1"))
                break;
        }
        System.out.println(v);


//напишите тут ваш код
    }
}
