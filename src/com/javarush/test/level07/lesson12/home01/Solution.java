package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> n = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++)
            n.add(Integer.parseInt(r.readLine()));

        for(int i = n.size()-1; i >= 0; i--)
        {
            n.add(i);
            System.out.println(n.get(i));
        }
        //напишите тут ваш код
    }
}
