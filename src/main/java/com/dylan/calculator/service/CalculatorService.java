/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.calculator.service;

/**
 *
 * @author dylan
 */
public interface CalculatorService {
    public int add(int a, int b);
    
    public boolean check(int a, int b);
    
    public byte decodeVal(String value);
    
    public char giveChar(char a);
    
    public long giveLong(long a);
    
    public boolean giveFalse(int a);
    
    public String checkNull(String a);
    
    public String checkNotNull(String a);
    
}
