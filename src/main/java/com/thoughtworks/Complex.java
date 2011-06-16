package com.thoughtworks;

public class Complex {
    private int real;
    private int virtual;

    public Complex(int real, int virtual) {
        this.real = real;
        this.virtual = virtual;
    }

    public Complex add(Complex another) {
        return new Complex(this.real + another.real, this.virtual + another.virtual);
    }

    public int getReal() {
        return real;
    }

    public int getVirtual() {
        return virtual;
    }

}
