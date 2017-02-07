package com.company.Viktor6109.lesson2.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by VK on 26.01.2017.
 */
public class Dice {
    public static void main(String[] args) {
        int dice1 = 6;
        int dice2 = 6;
        int sum;
        int maxCount = 0;

        ArrayList<Integer> sumList = new ArrayList<Integer>();
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> listMap = new ArrayList<Integer>();

        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                sum = i + j;
                sumList.add(sum);
            }
        }


        for (int i = 0; i < sumList.size(); i++) {
            int count = 0;
            int c = sumList.get(i);


            for (int j = 0; j < sumList.size(); j++) {
                int b = sumList.get(j);
                if (c == b) {
                    count++;
                }
            }

            hashMap.put(c, count);
        }
        for (Map.Entry<Integer, Integer> pair : hashMap.entrySet())

            for (int values : hashMap.values()) {
                listMap.add(values);
            }

        for (int i = 0; i < listMap.size(); i++) {
            maxCount = Math.max(maxCount, listMap.get(i));
        }

        System.out.print("Чаще выпадет сумма двух костей -");
        for (Map.Entry<Integer, Integer> pair : hashMap.entrySet()) {
            if (pair.getValue().equals(maxCount)) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
