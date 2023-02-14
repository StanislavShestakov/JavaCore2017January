package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(111|13);
        int[][] a = new int[10][];
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int num = r.nextInt(10);
            //int num1 = (int)(Math.random()*10);
            int [] array = new int[num];
            a[i] = array;
            for (int j = 0; j < num; j++) {
               a[i][j] = r.nextInt(1000);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }


}
