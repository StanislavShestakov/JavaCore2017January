package com.company.Viktor6109.lesson1.task4;

/**
 * Created by VK on 24.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        int minAge = 5;
        int maxAge = 15;
        for (int i = minAge; i < maxAge; i++) {
            for (int j = minAge; j < maxAge; j++) {
                for (int k = minAge; k < maxAge; k++) {
                    for (int c = minAge; c < maxAge; c++) {
                        int sum123 = j + k + i;
                        int sum124 = i + j + c;
                        int sum134 = i + k + c;
                        int sum234 = j + k + c;
                        if (sum123 == 30 && sum124 == 32 && sum134 == 32 && sum234 == 35)
                            System.out.println(" " + i + " " + j + " " + k + " " + c);

                    }
                }
            }
        }
    }
}
