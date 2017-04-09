package com.company;

/**
 * Created by Stas on 23.03.2017.
 */
public class Test {
    public static void main(String[] args) {

        String[] letters = new String[8];     // = {"a", "b", "c", "d", "e", "f", "g", "h"};
        letters[0] = "a";
        letters[1] = "b";
        letters[2] = "c";
        letters[3] = "d";
        letters[4] = "e";
        letters[5] = "f";
        letters[6] = "g";
        letters[7] = "h";

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};    // reverse to {8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < numbers.length/2 ; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < letters.length; j++) {

                System.out.print(letters[j] + numbers[i] + " ");
            }
            System.out.println("");
        }

    }
}
