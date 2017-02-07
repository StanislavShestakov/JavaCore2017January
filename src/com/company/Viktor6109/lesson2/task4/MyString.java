package com.company.Viktor6109.lesson2.task4;

/**
 * Created by VK on 26.01.2017.
 */
public class MyString {
    public static void main(String[] args) {
        int count = 0;

        String str = "My name's David. We're in a small village near Chicago. My cousin's getting married. My father " +
                "and her father are twins. A lot of relatives are here for the wedding party. We're very busy. My uncle's " +
                "friend is making palov. My sister Susan and Aunt Keane are making cakes. My mother's helping her niece " +
                "with her wedding dress. My grandparents are here too. They're very old. They live in Chicago. I'm making " +
                "a video and taking photos. It's great. I want to be a reporter.";

        String hhh[] = str.split("\\W+");
        for (String s : hhh) {
            System.out.println(s);
            count++;
        }
        System.out.println(count);
    }
}