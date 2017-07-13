package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse cherieMouse = new Mouse("Cherie", 10, 4);
        Dog butchDog = new Dog("Butch", 25, 10);
        Dog spikeDog = new Dog("Spike", 35, 10);
        Dog tykeDog = new Dog("Tyke", 20, 7);//
        Cat cludeCat = new Cat("Clyde", 15, 8);
        Cat tinCat = new Cat("Tine", 16, 7);
        Cat panCat = new Cat("Pan", 15, 9);
        Cat alleyCat = new Cat("Alley", 14, 8);// напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }//добавьте тут ваши классы

}
