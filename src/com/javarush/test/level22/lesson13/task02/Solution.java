package com.javarush.test.level22.lesson13.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
        Charset windows1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");

        byte[] bufferBytes = new byte[fileInputStream.available()];
        fileInputStream.read(bufferBytes);
        String copyW1251 = new String(bufferBytes, utf8);
        bufferBytes = copyW1251.getBytes(windows1251);
        fileOutputStream.write(bufferBytes);

        fileInputStream.close();
        fileOutputStream.close();
        /*ANOTHER VARIANT
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        List<String> lines = new ArrayList<>();
        while (fileReader.ready())
            lines.add(fileReader.readLine());
        fileReader.close();

        List<String> decodedLines = new ArrayList<>();
        for (String currentLine : lines)
            decodedLines.add(new String(currentLine.getBytes("Windows-1251")));

        PrintWriter printWriter = new PrintWriter(new FileWriter(args[1]));
        for (String currentLine : decodedLines)
            printWriter.println(currentLine);
        printWriter.close();
        */

    }
}
