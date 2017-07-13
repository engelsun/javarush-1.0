package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        String[] strings;
        BufferedReader brfr1 = new BufferedReader(new FileReader(file1));
        FileWriter fw2 = new FileWriter(file2);
        while (brfr1.ready())
        {
            strings = brfr1.readLine().split(" ");
            for (String s ://how this works?
                    strings)
            {
                int v = (int)Math.round(Double.valueOf(s));
                fw2.write(v + " ");
            }
        }
        brfr1.close();
        fw2.close();
    }
}
