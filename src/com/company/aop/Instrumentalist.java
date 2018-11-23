package com.company.aop;

/**
 * Created by Administrator on 2018/11/23.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {

        System.out.println("演奏"+song+"曲目");
        instrument.play();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
