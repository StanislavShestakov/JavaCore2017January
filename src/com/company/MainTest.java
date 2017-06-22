package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stas on 23.01.2017.
 */
public class MainTest {
    public static void main(String[] args) {
        //fifo
        List<String> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String command = scanner.nextLine();
            if(command.equals("list")){
                //распечать список людей
            }
            if(command.equals("exit")){
                break;
            }
        }
        //lifo
        //list exitall exitlast exit

    }
}
