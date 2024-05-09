package org.example;

public class TvSet {

    private volatile static TvSet tvSet;
    private TvSet(){
        System.out.println("Instance created");
    }

    public static TvSet createInstance(){

        if(tvSet == null) {
            synchronized (TvSet.class) {
                if (tvSet == null) {
                    tvSet = new TvSet();
                }
            }
        }

        return tvSet;
    }
}
