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
public class Student {
    
   private String studName;
   private double yearlyFees;
   private float interest;
   private int age;
   
   public String getName() {
      return studName;
   }

   public void setName(String name) {
      this.studName = name;
   }
 
   public double getFees() {
      return yearlyFees;
   }

   public void setFees(double yearlyFees) {
      this.yearlyFees = yearlyFees;
   }
   
   public double getInterest() {
      return interest;
   }

   public void setInterest(float interest) {
      this.interest = interest;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
   this.age = age;
   }
}
