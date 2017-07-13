package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "S";
        int d = 1;
        int f = 1;
        while(d<=10)
        {
            while (f<=10)
            {
                System.out.print(s);
                f++;
            }

            System.out.println();
            f=1;
            d++;
        }//напишите тут ваш код

    }
}
