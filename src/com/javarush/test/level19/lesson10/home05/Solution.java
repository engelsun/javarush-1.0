package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
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

        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2));
        for (String line :
                listOfLines)
        {
            String[] arrayOfLine = line.split(" ");
            String lineUpdate = "";
            for (int i = 0; i < arrayOfLine.length; i++)
            {
                if (arrayOfLine[i].matches(".*\\d.*"))
                {
                    lineUpdate += arrayOfLine[i] + " ";
                }
            }
            printWriter.println(lineUpdate);
        }
        printWriter.close();
    }
    
}
