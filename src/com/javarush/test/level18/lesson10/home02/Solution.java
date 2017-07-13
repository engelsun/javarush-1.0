package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int charAmount = 0;
        int spaceAmount = 0;
        double res = 0;

        while (inputStream.available()>0)
        {
            charAmount++;
            int data = inputStream.read();

            if(data == Integer.valueOf(' ')) spaceAmount++;
        }
        inputStream.close();
        res = (double) spaceAmount/charAmount * 100;

        System.out.printf("%.2f", res);

       /* byte[] array = new byte[inputStream.available()];
        inputStream.read(array);
        String text = new String(array);
        for (char ch: text.toCharArray())
        {
            if(Character.isWhitespace(ch))spaceAmount++;
            charAmount++;
        }

        double value = (double)spaceAmount/(double)charAmount*100;

        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        String formatDouble = new DecimalFormat("#.##", s).format(value);
        System.out.println(formatDouble);*/
//        inputStream.close();
    }
}
