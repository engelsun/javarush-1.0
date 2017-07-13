package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = 100;
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        while(fileInputStream.available()>0)
        {

            int data = fileInputStream.read();
            if (data<value) value = data;
        }
        fileInputStream.close();
        reader.close();

        System.out.println(value);}
}
