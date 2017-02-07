package com.company.Viktor6109.lesson3.task4;

/**
 * Created by VK on 06.02.2017.
 */
public class Carrot extends Pets implements Fly{
    public final Double minWeigt = 500.0;
    public final Double maxWeight = 3000.0;

//    public Carrot() {
//        setWeight(150 + Math.random() * 200);
//    }

//    public Carrot(Double weight) {
//        setWeight(weight);
//    }

    public Carrot(Double weight) {
        setWeight(weight);
        setMinWeight(minWeigt);
        setMaxWeight(maxWeight);
        getAlive();
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Кеша хороший");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void fly() {
        System.out.println("Крыльями машет");
    }
}
