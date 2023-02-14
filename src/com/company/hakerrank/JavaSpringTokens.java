package com.company.hakerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
public class JavaSpringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] tokens = S.split("[^a-zA-Z]");
        int numTokens = 0;

        for (int i=0; i<tokens.length; ++i)
            if (tokens[i].length() > 0)
                numTokens++;

        System.out.println(numTokens);

        for (int i=0; i<tokens.length;++i)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
    }
}
