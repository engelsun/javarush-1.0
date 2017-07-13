package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName1 = args[0];
        String fileName2 = args[1];
        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName1));
        String lineOfFile;
        List<String> listOfLines = new ArrayList<>();
        while ((lineOfFile = bufferedFileReader.readLine()) != null)
        {
            listOfLines.add(lineOfFile);
        }
        bufferedFileReader.close();


        String lineUpdate = "";
        for (String line :
                listOfLines)
        {
            String[] arrayOfLine = line.split(" ");
            for (int i = 0; i < arrayOfLine.length; i++)
            {
                if (arrayOfLine[i].length()>6)
                {
                    lineUpdate += arrayOfLine[i]+",";
                }
            }
        }

        if (lineUpdate.matches(".+,?"))
        {
            lineUpdate = lineUpdate.substring(0, lineUpdate.length()-1);
        }
        FileWriter fileWriter = new FileWriter(fileName2);
        fileWriter.write(lineUpdate);
        fileWriter.close();
    }
}
