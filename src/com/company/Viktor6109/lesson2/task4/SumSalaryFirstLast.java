package com.company.Viktor6109.lesson2.task4;

/**
 * Created by VK on 27.01.2017.
 */
public class SumSalaryFirstLast {
    public static void main(String[] args) {
        String string = "Коля заработал - 4000 гривень, Вася - 2000 гривень, Маша - 2500 гривень";
        //int c = string.indexOf('1');
        //System.out.println(string.indexOf(' '));
        //System.out.println(string.substring(string.indexOf(' ')));
        char a;
        int k;
        char[] c = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < 10; i++) {
            a = c[i];
            //System.out.print(a);
            k = string.length();
            if (k > string.indexOf(a)){
                k = string.indexOf(a);
                //System.out.print(k);
            }
            System.out.print(k + " ");
        }
        //System.out.print(k);


    }
}
