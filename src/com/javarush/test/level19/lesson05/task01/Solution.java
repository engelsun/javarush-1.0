package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        int indexOfByte = 0;
        while (fileReader.ready())
        {
            indexOfByte++;
            int data = fileReader.read();
            if (indexOfByte % 2 == 0)
            {
                fileWriter.write(data);
            }
        }
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
/*          ANOTHER VARIANT
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList<Integer> list = new ArrayList<Integer>();
        FileReader fileReader = new FileReader(fileName1);
        while (fileReader.ready())
            list.add(fileReader.read());
        fileReader.close();

        FileWriter fileWriter = new FileWriter(fileName2);
        for (int i = 1; i < list.size(); i=i+2)
            fileWriter.write((char)(int)list.get(i));
        fileWriter.close();
*/
    }
}
