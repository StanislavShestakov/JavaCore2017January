package com.company.Viktor6109.lesson3.task1;

/**
 * Created by VK on 06.02.2017.
 */
public class Cat {
    private Double originWeight;
    private Double weight;
    private Double minWeight;
    private Double maxWeight;
    private Double weightFreed;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
    }

    public void meow() {
        weight--;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    //  масса сьеденой еды. Вес кщта после то как он поел - weightAfterFeed
    public Double amoutFeed(Double weighAfterFeed) {
        if (weighAfterFeed > weight) {
            weightFreed = weighAfterFeed - weight;
        } else weightFreed = 0.0;
        return weightFreed;
    }

    //  кот сходил в туалет
    public void toilette(Double wc) {
        weight = weight - wc;
        System.out.println("AA-AA");
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}
