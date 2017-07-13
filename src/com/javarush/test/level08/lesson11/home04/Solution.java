package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array)
    {
        int min = array.get(0);
        for (int i = 1; i < array.size(); i++)
        {
            if (min > array.get(i))
                min = array.get(i);
        }
        return min;// Найти минимум
    }

    public static List<Integer> getIntegerList() throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> n = new ArrayList<Integer>();

        int N = -1;
        while (N <=0)
        {
            N = Integer.parseInt(r.readLine());
        }

        for(int i = 0; i < N; i++)
        {
            int x = Integer.parseInt(r.readLine());
            n.add(x);
        }
        //Тут создать и заполнить список
        return n;
    }
}
