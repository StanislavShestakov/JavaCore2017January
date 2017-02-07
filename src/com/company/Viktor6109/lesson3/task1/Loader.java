package com.company.Viktor6109.lesson3.task1;

/**
 * Created by VK on 06.02.2017.
 */
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //System.out.println(cat.getWeight());

        //cat.feed(8000.0);
        //System.out.println(cat.getWeight());

        System.out.println(cat.amoutFeed(8000.0));

        cat.toilette(10.0);
        System.out.println(cat.getWeight());

        System.out.println(cat.getStatus());
    }
    //- Создать в классе Cat метод, который будет возвращать массу съеденной еды.
    //- Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-­
    //  нибудь печатать.
}

