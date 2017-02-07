package com.company.Viktor6109.lesson3.task4;

/**
 * Created by VK on 06.02.2017.
 */
abstract public class Pets implements Comparable<Pets> {
    private Double minWeight;
    private Double maxWeight;
    private Boolean isAlive;
    private String weightPets;
    private String name;

    private double weight;
    private double weig;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //  минимальный и максимальный вес
    public void setMinWeight(Double minWeight) {
        this.minWeight = minWeight;
    }

    public Double getMinWeight() {
        return minWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }

    //  проверка веса чтобы не выходил за пределы
    public Boolean getAlive() {
        if ((weight > getMinWeight()) && (weight < getMaxWeight())) {
            isAlive = true;
        } else isAlive = false;
        return isAlive;
    }

    //  создание животного с обязательным указанием веса программистом
    //  и проверкой чтобы был в пределах дозволенного
    public Double getWeight() {
//        if ((weight > minWeight) && (weight < maxWeight)) {
//            weight = weight;
//        } else weight = 0.0;
//        return weight;
//    }
        while (isAlive) {
            weig = weight;
            break;
        }
        return weig;
    }

    //  преобразовал в String, что бы избавиться от 0.0.
    public String weightPets() {
        if (getWeight().equals(0.0)) {
            weightPets = "Ошибка. Нет веса - некормили или перекормили - запредельный вес. Труп";
        } else weightPets = (getWeight() + " ");
        return weightPets;
    }


    public final void run() {
        System.out.println("running");
    }

    public final void eat() {
        System.out.println("eat");
    }

    public void voice() {
        System.out.println("What say the  pet?");
    }

    abstract protected void sleep();

    //  отсиртировал
    @Override
    public int compareTo(Pets o) {
        if (this.getWeight() < o.getWeight())
            return -1;
        else if (this.getWeight() > o.getWeight())
            return +1;
        else
            return 0;
    }
}
