package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] s = new ArrayList[3];

        ArrayList<String> list1 = new ArrayList<String>();
        for(int i = 0; i<10;i++) list1.add("dfdfd");

        ArrayList<String> list2 = new ArrayList<String>();
        for(int i = 0; i<3;i++) list2.add("dsg");

        ArrayList<String> list3 = new ArrayList<String>();
        for(int i = 0; i<34;i++) list3.add("jfr");

        s[0] = list1;
        s[1] = list2;
        s[2] = list3;
        //напишите тут ваш код

        return s;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}