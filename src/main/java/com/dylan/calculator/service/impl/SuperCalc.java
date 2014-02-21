/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.calculator.service.impl;

import com.dylan.calculator.service.CalculatorService;

/**
 *
 * @author dylan
 */
public class SuperCalc implements CalculatorService{

    @Override
    public int add(int a, int b) {
        
       return a+b; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean check(int a, int b){
        
       if(a == b)
           return true;
       else
           return false;
    
    }
    
    @Override
    public byte decodeVal(String value){
        return Byte.decode(value);
    }
    
    @Override
    public char giveChar(char a){
        return a;
    }
    
    @Override
    public long giveLong(long a){
        return a+500000;
    }
    
    @Override
    public boolean giveFalse(int a){
        if(a > 100)
            return false;
        else
            return true;
    }
    
    @Override
    public String checkNull(String a){
        return a = null;
    }
    
    @Override
    public String checkNotNull(String a){
        return a;
    }
}
