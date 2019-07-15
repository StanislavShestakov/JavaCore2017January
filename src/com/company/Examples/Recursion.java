package com.company.Examples;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Stas on 14.10.2018.
 */
public class Recursion {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    static Date date1;
    static Date date2;

    public Recursion() throws ParseException {

    }

    public static void main(String[] args) throws ParseException {
        date1 = sdf.parse("2016-12-01");
        date2 = sdf.parse("2018-01-01");

        File[] files = new File("c:\\").listFiles();
        if (files != null)
            getFile(files);

    }
    public static void getFile(File[] files) throws ParseException {
        try {
            for (File file : files) {
                if (file.isDirectory()) {
                    getFile(file.listFiles());
                } else {
                    Path path = Paths.get(file.getPath());
                    BasicFileAttributes attr = null;
                    try {
                        attr = Files.readAttributes(path, BasicFileAttributes.class);
                        // System.out.println("creationTime: " + attr.creationTime());
//                    System.out.println("lastAccessTime: " + attr.lastAccessTime());
//                    System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
                        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        String dateCreated = df.format(attr.creationTime().toMillis());
                        Date dtCreated = sdf.parse(dateCreated);
                        if (dtCreated.compareTo(date1) >= 0 && dtCreated.compareTo(date2) <= 0) {
                            System.out.println(file);
                            System.out.println(dtCreated + "[" + dateCreated + "]");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
//                System.out.println("File: " + file);
                }
            }
        }catch (Exception e){

        }
    }
}
