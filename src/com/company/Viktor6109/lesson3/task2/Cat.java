package com.company.Viktor6109.lesson3.task2;

public class Cat {
    public static int getCatCount() {
        return catCount;
    }

    private static int catCount = 0;
    private Double originWeight;
    private Double weight;

    private Double minWeight = 1000.0;
    private Double maxWeight = 9000.0;

    private Boolean isAlive;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        //minWeight = 1000.0;
        //maxWeight = 9000.0;
        catCount++;
    }

    //  конструктор который  принимает вес кота
    public Cat(Double weig) {
        weight = weig;
        originWeight = weight;
        while (getAlive()) {
            catCount++;
            break;
        }
    }

    //   возарщает тип Cat, и создает глубокую копию кота
    public static Cat catClone(Cat cat) {
        return cat;
    }

    //  возвращает жив ли кот
    public Boolean getAlive() {
        if ((getWeight() > minWeight) && (getWeight() < maxWeight)) {
            isAlive = true;
        } else isAlive = false;
        return isAlive;
    }


    public static Double catWeightDifference(Cat cat1, Cat cat2) {
        Double diff = Math.abs(cat1.getWeight() - cat2.getWeight());
        return diff;
    }


    public void meow() {
        weight--;
        System.out.println("Meow");
    }

    //public void

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
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