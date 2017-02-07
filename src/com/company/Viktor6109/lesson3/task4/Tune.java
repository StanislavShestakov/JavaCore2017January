package com.company.Viktor6109.lesson3.task4;

/**
 * Created by VK on 06.02.2017.
 */
public class Tune extends Pets implements Sweem, Fly{
    public final Double minWeigt = 1000.0;
    public final Double maxWeight = 40000.0;

//    public Tune() {
//        setWeight(500 + Math.random() * 20000);
//    }

//    public Tune(Double weight) {
//        setWeight(weight);
//    }

    public Tune(Double weight) {
        setWeight(weight);
        setMinWeight(minWeigt);
        setMaxWeight(maxWeight);
        getAlive();
    }


    @Override
    public void voice() {
        super.voice();
        System.out.println("Брынчит как расстроенная гитара");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void sweem() {

    }

    @Override
    public void fly() {

    }
}
