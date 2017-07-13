package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFile = new BufferedReader(new FileReader(r.readLine()));
        String s = readFile.readLine();


        ArrayList<Integer> list = new ArrayList<>();
        while (s!=null)
        {
            list.add(Integer.valueOf(s));
            s = readFile.readLine();
        }

        Collections.sort(list);
        for(int n : list)
            if (n%2==0) System.out.println(n);

        r.close();
        readFile.close();

        // напишите тут ваш код
    }
}
