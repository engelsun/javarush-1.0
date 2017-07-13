package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String Anton = reader.readLine();
        String Artem = reader.readLine();
        int a = Anton.length();
        int b = Artem.length();

        if (Anton.equals(Artem))
            System.out.println("Имена идентичны");
        else if (a==b)
            System.out.println("Длины имен равны");
        //напишите тут ваш код

    }
}
