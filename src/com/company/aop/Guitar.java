package com.company.aop;

/**
 * Created by Administrator on 2018/11/23.
 */
public class Guitar implements Instrument {

    @Override
    public void play() {
        System.out.println("Strum strum strum");
    }
}
