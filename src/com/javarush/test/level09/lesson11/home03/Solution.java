package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData()
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> n = new ArrayList<Integer>();
        try
        {
            while (true)
            {
                n.add(Integer.parseInt(r.readLine()));
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
        for (int i : n)
        {
            System.out.println(i);
        }//напишите тут ваш код
    }
}
