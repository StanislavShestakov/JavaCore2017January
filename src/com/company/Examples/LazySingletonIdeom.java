package com.company.Examples;

/**
 * Created by Stas on 22.06.2017.
 */
public class LazySingletonIdeom {
    volatile  private  static  LazySingletonIdeom INSTANCSE;
    public LazySingletonIdeom() {
    }

    public static  class LazySingltonHolder{
        private  static  final LazySingletonIdeom INSTANCE = new LazySingletonIdeom();
    }

    public  static  LazySingletonIdeom getInstance(){
        return LazySingltonHolder.INSTANCE;
    }
}
