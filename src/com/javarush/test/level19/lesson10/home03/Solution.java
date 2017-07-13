package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName));
        String lineOfFile;
        List<String> listOfLines = new ArrayList<>();
        while ((lineOfFile = bufferedFileReader.readLine()) != null)
        {
            listOfLines.add(lineOfFile);
        }
        bufferedFileReader.close();


        for (String line :
                listOfLines)
        {
            String[] arrayOfLine = line.split(" ");
            String name = "";
            for (int i = 0; i < arrayOfLine.length - 3; i++)
            {
                if (i == arrayOfLine.length - 4)
                {
                    name = name + arrayOfLine[i];
                }
                else
                {
                    name = name + arrayOfLine[i] + " ";
                }
            }
            int year = Integer.parseInt(arrayOfLine[arrayOfLine.length - 1]);
            int month = Integer.parseInt(arrayOfLine[arrayOfLine.length - 2]) - 1;
            int day = Integer.parseInt(arrayOfLine[arrayOfLine.length - 3]);
            Date birthday = new GregorianCalendar(year, month, day).getTime();
            PEOPLE.add(new Person(name, birthday));
        }

    }

}
