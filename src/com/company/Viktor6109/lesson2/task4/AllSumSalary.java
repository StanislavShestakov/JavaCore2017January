package com.company.Viktor6109.lesson2.task4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by VK on 27.01.2017.
 */
public class AllSumSalary {
    public static void main(String[] args) {
        String string = "Коля заработал - 1000 гривень, Вася - 2000 гривень, Маша - 2500 гривень";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);
        ArrayList<Integer> str = new ArrayList<Integer>();
        int sumSalary = 0;

        while (matcher.find()) {
            str.add(Integer.parseInt(matcher.group(0)));
        }
        for (int i = 0; i < str.size(); i++) {
            sumSalary = sumSalary + str.get(i);
        }
        System.out.println("Сумма заработанных денег " + sumSalary);
    }
}
