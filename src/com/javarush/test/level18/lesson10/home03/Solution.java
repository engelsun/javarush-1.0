package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        String file3 = br.readLine();

        FileReader fis2 = new FileReader(file2);
        FileReader fis3 = new FileReader(file3);

        FileWriter fos1 = new FileWriter(file1, true);

        while (fis2.ready())
        {
            int readB2 = fis2.read();
            fos1.write(readB2);
        }

        while (fis3.ready())
        {
            int readB3 = fis3.read();
            fos1.write(readB3);
        }

        br.close();
        fis2.close();
        fis3.close();
        fos1.close();
    }
}
