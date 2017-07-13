package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileInputStream inputStreamFile1 = new FileInputStream(file1);
        FileOutputStream outputStreamFile2 = new FileOutputStream(file2);
        FileOutputStream outputStreamFile3 = new FileOutputStream(file3);

        while (inputStreamFile1.available()>0)
        {
            byte[] buffer = new byte[inputStreamFile1.available()];
            int count = inputStreamFile1.read(buffer);
            if(count%2==0)
            {
                outputStreamFile2.write(buffer,0,count/2);
                outputStreamFile3.write(buffer,count/2,count/2);
            }
            else
            {
                outputStreamFile2.write(buffer,0,count/2+1);
                outputStreamFile3.write(buffer,count/2+1,count/2);
            }
        }

        reader.close();
        inputStreamFile1.close();
        outputStreamFile2.close();
        outputStreamFile3.close();

    }
}
