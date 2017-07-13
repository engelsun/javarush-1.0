package com.javarush.test.level20.lesson10.home07;

import java.io.*;

/* Переопределение сериализации в потоке
Сериализация/десериализация Solution не работает.
Исправьте ошибки не меняя сигнатуры методов и класса.
Метод main не участвует в тестировании.
Написать код проверки самостоятельно в методе main:
1) создать экземпляр класса Solution
2) записать в него данные  - writeObject
3) сериализовать класс Solution  - writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные - writeObject
6) проверить, что в файле есть данные из п.2 и п.5
*/
public class Solution implements Serializable, AutoCloseable {
    public static void main(String[] args) throws Exception
    {
        Solution solution1 = new Solution("d:\\1.txt");
        solution1.writeObject("Hello world");
        solution1.close();
        //SAVE
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\2.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream((fileOutputStream));
        objectOutputStream.writeObject(solution1);
        //objectOutputStream.flush();
        //objectOutputStream.close();
        //LOAD
        FileInputStream fileInputStream = new FileInputStream("d:\\2.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Solution solution2 = (Solution) objectInputStream.readObject();
        //objectInputStream.close();
        solution2.writeObject("Hi2");
        solution2.writeObject("Hi3");
        solution2.close();
    }

    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(this.fileName, true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}
