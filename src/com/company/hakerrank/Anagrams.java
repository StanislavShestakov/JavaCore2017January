package com.company.hakerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        char[] ach = a.toLowerCase().toCharArray();
        char[] bch = b.toLowerCase().toCharArray();
        Arrays.sort(ach);
        Arrays.sort(bch);

        for (int i = 0; i < ach.length; i++) {
            if(ach[i] != bch[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
