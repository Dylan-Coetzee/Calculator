/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.calculator.config;

import com.dylan.calculator.service.CalculatorService;
import com.dylan.calculator.service.impl.CalculatorServiceImpl;
import com.dylan.calculator.service.impl.SuperCalc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author dylan
 */
@Configuration
public class AppConfig {
    
    @Bean(name ="retired")
    public CalculatorService getService(){
        return new CalculatorServiceImpl();
    }
    
    @Bean(name ="calc")
    public CalculatorService getServicenew(){
        return new SuperCalc();
    }
    
    
}

