package com.company.Viktor6109.lesson3.task3;

/**
 * Created by VK on 06.02.2017.
 */
public class Dog extends Pets {
    public void guard(){
        System.out.println("Охраняю дом");
    }

    public void prey(){
        super.prey();
        System.out.println("котов");
    }

    public void speak(){
        super.speak();
        System.out.println("гавкаю");
    }
}
