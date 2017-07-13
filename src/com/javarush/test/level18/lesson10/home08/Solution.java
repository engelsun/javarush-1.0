package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        try
        {
            String fileName;
            while (!(fileName = br.readLine()).equals("exit"))
            {
                list.add(fileName);
            }
            br.close();
            for (String s :
                    list)
            {
                ReadThread readThread = new ReadThread(s);
                readThread.start();
                readThread.join();
            }
        }
        catch (Exception ignored){}
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) throws IOException
        {
            //implement constructor body
                this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run()
        {
            try
            {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                ArrayList<Integer> list = new ArrayList<>();
                while (fileInputStream.available() > 0)
                {
                    int data = fileInputStream.read();
                    list.add(data);
                }
                fileInputStream.close();

                int max = 0, idMax = 0, count;
                for (int i = 0; i < list.size(); i++)
                {
                    count = Collections.frequency(list, list.get(i));
                    if(count>max)
                    {
                        max = count; idMax = list.get(i);
                    }
                }
                resultMap.put(fileName,idMax);
            }
            catch (Exception ignored){}
        }
    }
}
