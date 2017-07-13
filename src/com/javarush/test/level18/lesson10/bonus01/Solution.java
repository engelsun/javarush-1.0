package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {

    private static byte key = 10;

    public static void main(String[] args) throws IOException
    {

        FileInputStream in = new FileInputStream(args[1]);
        FileOutputStream out = new FileOutputStream(args[2]);

        while (in.available() > 0){
            byte[] data = new byte[in.available()];
            in.read(data);
            if(args[0].equals("-e"))
            {
                out.write(crypt(data));
            }
            if(args[0].equals("-d"))
            {
                out.write(deCrypt(data));
            }
        }
        in.close();
        out.close();
    }

    private static byte[] crypt(byte[] data){
        byte[] res = new byte[data.length];

        for(int i = 0; i < data.length; i++)
        {
            res[i] = (byte)(data[i] ^ key);
        }

        return res;
    }

    private static byte[] deCrypt(byte[] data) {

        return crypt(data);
    }

    /* ANOTHER VARIANT
    if (args[0].equals("-e")){  // необходимо зашифровать данные
         while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
             fileOutputStream.write(data+key);
         }
        }
        if (args[0].equals("-d")){  // -d - ключ указывает, что необходимо расшифровать данные
            while (fileInputStream.available() > 0){
                int data = fileInputStream.read();
                fileOutputStream.write(data-key);
     */

}
