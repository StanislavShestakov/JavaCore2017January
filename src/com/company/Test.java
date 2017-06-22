package com.company;

/**
 * Created by Stas on 23.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a + " " + b);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        //b = b + "";
        b += "";
        System.out.println(a + " " + b);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("d");
        System.out.println(sb);




    }
}
