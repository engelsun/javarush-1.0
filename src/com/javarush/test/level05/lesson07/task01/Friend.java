package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String friendname = null;
    public void initialize(String name)
    {
        this.friendname = name;
    }

    private int friendage = Integer.parseInt(null);
    public void initialize(String name, int age)
    {
       this.friendage = Integer.parseInt(name + age);
    }

    private String friendgender = null;
    public void initialize(String name, int age, String gender)
    {
        this.friendgender = name + age + gender;
    }//напишите тут ваш код
}
