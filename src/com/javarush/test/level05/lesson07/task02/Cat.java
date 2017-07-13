package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String catname;
    int catweight = 3;
    int catage = 7;
    String catcolor;
    String catadress;
    
    
    public void initialize(String name)
    {
       this.catname = name;
    }

    public void initialize(String name, int weight, int age)
    {
        this.catname = name;
        this.catweight = weight;
        this.catage = age;
    }

    public void initialize(String name, int age)
    {
        this.catname = name;
        this.catage = age;
    }
    
    public void initialize(int weight, String color)
    {
        this.catweight = weight;
        this.catcolor = color;
    }
       
    public void initialize(int weight, String color, String adress)
    {
        this.catweight = weight;
        this.catcolor = color;
        this.catadress = adress;
    }//напишите тут ваш код

}
