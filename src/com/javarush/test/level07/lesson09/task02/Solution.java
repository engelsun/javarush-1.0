package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> s = new ArrayList<String>();

        for(int i = 0; i < 5; i++)
            s.add(r.readLine());

        s.remove(2);

        for(int i = s.size() - 1; i >= 0; i--)
            System.out.println(s.get(i));//напишите тут ваш код

    }
}
