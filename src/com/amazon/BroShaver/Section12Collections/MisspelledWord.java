package com.amazon.BroShaver.Section12Collections;

public class MisspelledWord {
    private String intention;
    private String mispelledWord;

    public MisspelledWord(String intention, String mispelledWord) {
        this.intention = intention;
        this.mispelledWord = mispelledWord;
    }

    public String getIntention() {
        return intention;
    }

    public String getWord() {
        return mispelledWord;
    }
}
