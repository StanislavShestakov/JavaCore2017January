package com.company.Viktor6109.lesson3.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by VK on 06.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Random r = new Random();

//        Pet cat = new Cat();
//        Pet dog = new Dog();
//        System.out.println(cat.compareTo(dog));

        Pets dog = new Dog(20000.0);
        Pets cat = new Cat(10000.0);
        Pets carrot = new Carrot(1000.0);
        Pets tune = new Tune(1600.0);
        Pets dog1 = new Dog("Шарик", 200000.0);

//        System.out.println(dog.getWeight());
//        System.out.println(dog.weightPets());
//        System.out.println(dog.getMinWeight());
//        System.out.println(dog.getMaxWeight());
//        System.out.println(dog.getAlive());

        ArrayList<Pets> petss = new ArrayList<>();
        petss.add(dog);
        petss.add(cat);
        petss.add(carrot);
        petss.add(tune);
        petss.add(dog1);


//        Pet cat = new Cat(400.0);
//        System.out.println(cat.getWeight());

//        System.out.println(dog1.getMinWeight());
//        System.out.println(dog1.getMaxWeight());

//        ArrayList<Pet> pets = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            int random = r.nextInt(4);
//            switch (random) {
//                case 0: pets.add(new Cat());
//                    break;
//                case 1: pets.add(new Dog());
//                    break;
//                case 2: pets.add(new Carrot());
//                    break;
//                case 3: pets.add(new Tune());
//                    break;
//                default:
//                     pets.add(null);
//                    break;
//            }
//        }
//        for (Pets pet : petss) {
//            System.out.println(pet.getName() + " " + pet.getWeight());
//        }
//
        Collections.sort(petss);
        for (Pets pet : petss) {
            //pet.voice();
            System.out.println(pet.getName() + " " + pet.weightPets());
        }

        // поправте ситуацию с абстракцией так, чтобы вес обязательно определял программитс, создавая какое
        // то домашнее животное, поиграйьтесь с абстракцией, так чтобы было побольше домашних животных
        // с разными  возможностми(методами)

    }
}

