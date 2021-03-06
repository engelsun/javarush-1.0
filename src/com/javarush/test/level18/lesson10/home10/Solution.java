package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        Set<File> fileSet = new TreeSet<>();
        while (!(fileName = bufferedReader.readLine()).equals("end"))
        {
            File file = new File(fileName);
            fileSet.add(file);
        }
        bufferedReader.close();

        Iterator<File> fileIterator = fileSet.iterator();
        String setOutputFileName = fileIterator.next().getAbsolutePath();
        setOutputFileName = setOutputFileName.substring(0, setOutputFileName.length() - 6);

        FileOutputStream fileOutputSteam = new FileOutputStream(setOutputFileName, true);
        for (File file :
                fileSet)
        {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[fileInputStream.available()];
            while (fileInputStream.available()>0)
            {
                fileInputStream.read(buffer);
                fileOutputSteam.write(buffer);
            }
            fileInputStream.close();
        }
        fileOutputSteam.close();
    }
}
