package com.company.Viktor6109.lesson3.task4;

/**
 * Created by VK on 06.02.2017.
 */
public class Cat extends Pets{
    public final Double minWeigt = 1000.0;
    public final Double maxWeight = 15000.0;


//    public Cat() {
//        setWeight(1000  + Math.random() * 2000);
//    }
//    public Cat(Double weight){setWeight(weight);}

    public Cat(Double weight) {
        setWeight(weight);
        setMinWeight(minWeigt);
        setMaxWeight(maxWeight);
        getAlive();
    }


    public void voice(){
        super.voice();
        System.out.println("Meow");
    }

    @Override
    protected void sleep() {
        System.out.println("Mur");
    }

}
