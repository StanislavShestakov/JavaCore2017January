package com.company.Viktor6109.lesson2.task1;

/**
 * Created by VK on 25.01.2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {

        int count;
        int numer = 10000;
        for (int i = 2; i < numer; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count <= 2){
                System.out.println("Простое число " + i);
            }else {
                continue;
            }
        }
    }
}
