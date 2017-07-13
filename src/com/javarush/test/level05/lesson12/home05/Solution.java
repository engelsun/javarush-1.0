package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        while(true)
        {
            String s = r.readLine();
            if(s.equals("сумма")) break;//important that this line must be after "String s"
            int n = Integer.parseInt(s);
            a += n;
        }
        System.out.println(a);
        //напишите тут ваш код
    }
}
