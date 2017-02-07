package com.company.Viktor6109.lesson3.task4;

/**
 * Created by VK on 06.02.2017.
 */
public class Dog extends Pets implements Sweem{
    //    public Dog() {
//        setWeight(1500  + Math.random() * 5000);
//        }
    public final Double minWeigt = 3000.0;
    public final Double maxWeight = 40000.0;


    public Dog(Double weight) {
        setWeight(weight);
        setMinWeight(minWeigt);
        setMaxWeight(maxWeight);
        getAlive();
    }

    public Dog(String name, Double weight) {
        setName(name);
        setWeight(weight);
        setMinWeight(minWeigt);
        setMaxWeight(maxWeight);
        getAlive();
    }

    public void voice() {
        super.voice();
        System.out.println("Uff");
    }

    @Override
    protected void sleep() {
        System.out.println("RRRr");
    }

    @Override
    public void sweem() {

    }
}
