package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(fileName);
        int countOfWord = 0;
        String lineOfWords = "";

        while (fileReader.ready())
        {
            char symbol = (char) fileReader.read();
            lineOfWords += symbol;//String.valueOf(symbol).toLowerCase();
        }
        fileReader.close();

        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(lineOfWords);

        while (matcher.find())
        {
            countOfWord++;
        }
        System.out.println(countOfWord);

/*              ANOTHER VARIANT
        lineOfWords = lineOfWords.replaceAll("\\p{Punct}"," ");

        String[] arrayOfWords = lineOfWords.split(" "); // OR String[] words = sb.toString().split("\\W");
        for (String s :
                arrayOfWords)
        {
            s = s.trim();
            if (s.equals("world"))
            {
                countOfWord++;
            }

        }
        System.out.println(countOfWord);
*/



    }
}
