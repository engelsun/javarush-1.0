package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[10];
        for (int i = 0; i < n.length; i++)
        {
            n[i] = Integer.parseInt(r.readLine());
        }

        for (int i = 9; i >= 0; i--)
            System.out.println(n[i]);//напишите тут ваш код

    }
}
