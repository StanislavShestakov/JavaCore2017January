package com.company.Viktor6109.lesson2.task2;

/**
 * Created by VK on 25.01.2017.
 */
public class Chess {
    public static void main(String[] args) {
        int height = 8;
        int width = 8;
        int a = 9724;
        int b = 9856;

        for (int i = 0; i < height; i++) {
            for (int j = i; j < width + i; j++) {
                if (j % 2 == 0) {
                    System.out.print((char) a + " ");
                } else System.out.print((char) b + " ");
            }
            System.out.println();
        }
    }
}
