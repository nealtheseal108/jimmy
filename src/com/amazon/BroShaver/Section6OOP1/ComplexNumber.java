package com.amazon.BroShaver.Section6OOP1;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double addendReal, double addendImaginary) {
        this.real += addendReal;
        this.imaginary += addendImaginary;
    }

    public void add(ComplexNumber addendComplex) {
        this.real += addendComplex.getReal();
        this.imaginary += addendComplex.getImaginary();
    }

    public void subtract (double addendReal, double addendImaginary) {
        this.real -= addendReal;
        this.imaginary -= addendImaginary;
    }

    public void subtract(ComplexNumber addendComplex) {
        this.real -= addendComplex.getReal();
        this.imaginary -= addendComplex.getImaginary();
    }



}
