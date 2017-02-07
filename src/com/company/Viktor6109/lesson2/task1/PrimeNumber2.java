package com.company.Viktor6109.lesson2.task1;

/**
 * Created by VK on 25.01.2017.
 */
public class PrimeNumber2 {
    public static void main(String[] args) {
        int numer = 10000;

        for (int i = 2; i <= numer; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else b = true;
            }
            if (b) {
                System.out.println("Простое число " + i);
            }
        }
    }
}
