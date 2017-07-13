package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String catname;
    private int catweight = 3;
    private int catage = 7;
    private String catcolor;
    private String catadress;


    public Cat(String name)
    {
        this.catname = name;
    }

    public Cat(String name, int weight, int age)
    {
        this.catname = name;
        this.catweight = weight;
        this.catage = age;
    }

    public Cat(String name, int age)
    {
        this.catname = name;
        this.catage = age;
    }

    public Cat(int weight, String color)
    {
        this.catweight = weight;
        this.catcolor = color;
    }

    public Cat(int weight, String color, String adress)
    {
        this.catweight = weight;
        this.catcolor = color;
        this.catadress = adress;
    }//напишите тут ваш код

}
