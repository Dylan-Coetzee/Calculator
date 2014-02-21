/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.calculator;

/**
 *
 * @author dylan
 */
public class Complex {

    int real;
    int imaginary;
    
    public Complex(int r, int i){
        real = r;
        imaginary = i;
    }
    
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }
    
    public int getImagine() {
        return real;
    }

    public void setImagine(int imaginary) {
        this.imaginary = imaginary;
    }
    
    public int add(Complex com) {      
        return (real+imaginary)+(com.getImagine()+com.getReal());
    }
}
