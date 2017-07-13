package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        FileInputStream fis1 = new FileInputStream(file1);
        while (fis1.available() > 0)
        {
            int b = fis1.read();
            list1.add(b);
        }
        fis1.close();

        FileInputStream fis2 = new FileInputStream(file2);
        while (fis2.available() > 0)
        {
            int b = fis2.read();
            list2.add(b);
        }
        fis2.close();

        FileOutputStream fos1 = new FileOutputStream(file1);
        for (int b :
                list2)
        {
            fos1.write(b);
        }
        fos1.close();

        FileOutputStream fos1d = new FileOutputStream(file1,true);
        for (int b :
                list1)
        {
            fos1d.write(b);
        }
        fos1d.close();







    }
}
