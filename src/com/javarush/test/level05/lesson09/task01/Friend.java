package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friendname;
    private int friendage;
    private String friendgender;

    public Friend(String name)
    {
        this.friendname = name;
    }

    public Friend(String name, int age)
    {
        this.friendname = name;
        this.friendage = age;
    }

    public Friend(String name, int age, String gender)
    {
        this.friendname = name;
        this.friendage = age;
        this.friendgender = gender;
    }//напишите тут ваш код

}