package com.company;

/**
 * Created by Stas on 23.01.2017.
 */
public class MainTest {
    public static void main(String[] args) {
        String[] letter = {"A", "B", "C", "D", "E", "F", "G", "H"};
        for (int i = letter.length - 1; i >= 0; i--) {
            for (int j = 0; j < letter.length; j++) {
                System.out.print(letter[j] + (i + 1) + " ");
            }
            System.out.println();
        }

    }
}
