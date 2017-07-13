package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int letterAmount = 0;
        while (fileInputStream.available()>0)
        {
            Character ch = (char)fileInputStream.read();
            if(String.valueOf(ch).matches("[a-zA-Z]"))
            {
                letterAmount++;
            }
        }
        fileInputStream.close();
        System.out.println(letterAmount);

    }
}
