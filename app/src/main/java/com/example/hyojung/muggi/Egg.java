package com.example.hyojung.muggi;

/**
 * Created by hyojung on 2017. 6. 11..
 */

public class Egg {
    protected int warmth=10;
    protected void passMin(){
        if(warmth>0)
            warmth=warmth-1;
    }
    protected void hug() {
        if (warmth < 100)
            warmth = warmth + 1;
    }

    public Egg(int warmth){
        this.warmth=warmth;
    }
}
