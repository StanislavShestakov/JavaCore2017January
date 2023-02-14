package com.company.treads;

/**
 * Created by Stas on 21.07.2017.
 */
public class Loader {
    static int counter = 0;
    public static final Object BLOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        new Thread() {
            public void run() {
                System.out.println(getName());
            }
        }.start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + ", " + Thread.currentThread().getState());
            }
        }).start();

//        for (int i = 0; i < 10000; i++) {
//            new Thread(() ->{
//                for (int j = 0; j < 100; j++) {
//                    counter++;
//                }
//            }).start();
//        }
//        System.out.println(counter);
         final Loader loader = new Loader();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    loader.inc();
                }
            }).start();
        }
        Thread.sleep(500);
        //loader.inc();
        System.out.println(counter);

    }

    //    private static void inc(){
//        double a = Math.sin(13.);
//        synchronized (BLOCK) {
//            counter++;
//        }
//    }
    public void inc() {
        double a = Math.sin(13.);
        synchronized (this) {
            counter++;
        }
    }
}
