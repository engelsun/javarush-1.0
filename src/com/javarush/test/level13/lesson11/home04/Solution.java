package com.javarush.test.level13.lesson11.home04;

import java.io.*;
/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        InputStream inStream = new FileInputStream(s);


        while(inStream.available()>0 && !s.equals("exit"))
        {
            System.out.println((char)inStream.read());
        }

        inStream.close();
        reader.close();
    }
}
