package com.tirasel.dev.limitsservice.bean;

public class Limits {
    private int minimum;
    private int maximum;

    public Limits() {
    }

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int maximum) {
        this.minimum = maximum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
