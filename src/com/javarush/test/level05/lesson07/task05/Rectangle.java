package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int left;
    int top;
    int width;
    int height;

    public void initialize(int left, int top, int width, int height)
    {
        this.left = 2;
        this.top = 1;
        this.width = 4;
        this.height = 2;
    }

    public void initialize(int width, int height)
    {
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int height)
    {
        this.height = 0;
    }

    public void initialize(Rectangle anotherRectangle)
    {
        this.top = 2;
        this.left = 1;
        this.width = 2;
        this.height = 2;
    }
    //напишите тут ваш код

}
