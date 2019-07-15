package com.company.treads;

/**
 * Created by Stas on 16.07.2018.
 */
public class Example extends Thread{
    public  void run() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("i::"+i);
        }
    }

    public static void main(String[] args) {
        Example obj = new Example();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);

        t1.start();
        t2.start();
        t3.start();
    }
}
