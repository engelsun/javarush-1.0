package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> s = new ArrayList<String>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++)
        {
            String s1 = r.readLine();
            s.add(s1);
        }

        int max = s.get(0).length();

        for(int i = 0; i < s.size(); i++)
        {
            if (s.get(i).length() > max)
                max = s.get(i).length();
        }

        for (int i = 0; i < s.size(); i++)
        {
            if (max == s.get(i).length())
                System.out.println(s.get(i));
        }
        //напишите тут ваш код
    }
}
