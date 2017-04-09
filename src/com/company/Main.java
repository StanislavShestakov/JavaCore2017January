package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i <1000 ; i++) {
            if (i%2 > 0){
                System.out.println(i);
            }
        }

        int maxBoxesInContainer = 5;
        int maxContainers = 5;
        int maxBoxesInShip = maxBoxesInContainer*maxContainers;
        int containerNumber = 1;
        int shipNumber = 1;
        int boxesToDelivery = 100;
        System.out.println("Корабль №" + shipNumber);
        System.out.println("--Контейнер №" + containerNumber);
        for (int i = 1; i <= boxesToDelivery ; i++) {
            System.out.println("----Ящик №"+i);
            if ((i%maxBoxesInShip==0) && (i!=boxesToDelivery)){
                shipNumber++;
                containerNumber++;
                System.out.println("Корабль №" + shipNumber);
                System.out.println("--Контейнер №"+containerNumber);
            } else if ((i%maxBoxesInContainer==0) && (i!=boxesToDelivery)){
                containerNumber++;
                System.out.println("--Контейнер №"+containerNumber);
            }

        }


    }


}
