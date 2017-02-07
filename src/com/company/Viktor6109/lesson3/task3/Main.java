package com.company.Viktor6109.lesson3.task3;

/**
 * Created by VK on 06.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Dog sharik = new Dog();
        Cat vaska = new Cat();

        vaska.run();
        sharik.run();
        vaska.prey();
        sharik.prey();
        vaska.speak();
        sharik.speak();
    }
}
