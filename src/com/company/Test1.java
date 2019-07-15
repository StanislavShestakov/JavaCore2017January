package com.company;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Stas on 23.09.2018.
 */
public class Test1 {
    public static void main(String[] args) {
        File folder = new File("c:\\");
        Test1.oeNiger(folder);

    }
    public static void oeNiger(File file){
        try {
            for (File file1: file.listFiles()){
                if (file1.isDirectory()){
                    oeNiger(file1);
                    continue;
                }

                System.out.println(file1.toString());

            }
        }catch (Exception e){
            System.out.println("нихуя не вышло!!!!");
        }

    }
}
