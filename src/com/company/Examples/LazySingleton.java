package com.company.Examples;

/**
 * Created by Stas on 22.06.2017.
 */
public class LazySingleton {
    int i;
    volatile private static LazySingleton INSTANCE;
    double sin = Math.sin(13.);
    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(INSTANCE == null){
            synchronized (LazySingleton.class){
                if(INSTANCE == null){
                    int i =13;
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
