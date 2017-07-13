package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Artem", 22, "Ukraine");
        Man man2 = new Man("Andrey", 18, "Ukraine");
        Woman woman1 = new Woman("Anna", 20, "Russia");
        Woman woman2 = new Woman("Katya", 21, "Russia");
        //создай по два объекта каждого класса тут

        System.out.println(man1+"\n"+man2+"\n"+woman1+"\n"+woman2);//выведи их на экран тут
    }

    public static class Man
    {
        public String name;
        public int age;
        public String address;

        public Man (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
        public String name;
        public int age;
        public String address;

        public Woman (String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
    //добавьте тут ваши классы
}
