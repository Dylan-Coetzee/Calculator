/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.calculator;

import com.dylan.calculator.config.AppConfig;
import com.dylan.calculator.service.CalculatorService;
import com.dylan.calculator.service.impl.CalculatorServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author dylan
 */
public class CalculatorTest {
    private static CalculatorService service;
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    /**
     *
     */
     @Test
     public void add() {
         Assert.assertEquals(service.add(2,5), 7);
         Assert.assertEquals(service.add(2,5), 7, "Value expected is 7");
     }
     
     //Test1//////////////////////////////////////////////
     Complex z1 = new Complex(1,1);
     
     Complex z2 = new Complex(1,1);
     
     int z3 = z1.add(z2);
        
     @Test
     public void testAdd(){
         Assert.assertEquals(4, z3, "Addition failed in real part");
         Assert.assertEquals(4, z3, "Addition failed in imaginary part");
     }
     /////////////////////////////////////////////////////
     
     //Test2//////////////////////////////////////////////
     Student std = new Student();
     
     @Test
     public void CheckAssert(){
        std.setName("Dylan");
        std.setFees(600.00);
        std.setInterest(1);
        std.setAge(20); 
        
        Assert.assertEquals(600.00, std.getFees(), 0);
        Assert.assertEquals(600, std.getFees(), 0);
        Assert.assertEquals("Dylan", std.getName());
     }
     /////////////////////////////////////////////////////
     
     //Test3//////////////////////////////////////////////
     @Test
     public void check(){
         Assert.assertEquals(service.check(1, 1), true);
         Assert.assertEquals(service.check(1, 1), true, "Value expected is true");
     }
     /////////////////////////////////////////////////////
     
     //Test4//////////////////////////////////////////////
     @Test
     public void decodeVal(){
         Assert.assertEquals(service.decodeVal("100"), 100);
         Assert.assertEquals(service.decodeVal("100"), 100, "Value expected is 100");
     }
     /////////////////////////////////////////////////////
     
     //Test5//////////////////////////////////////////////
     @Test
     public void giveChar(){
         Assert.assertEquals(service.giveChar('a'), 'a');
         Assert.assertEquals(service.giveChar('a'), 'a', "Value expected is ab");
     }
     /////////////////////////////////////////////////////
     
     //Test6//////////////////////////////////////////////
     @Test
     public void giveLong(){
         Assert.assertEquals(service.giveLong(500000), 1000000);
         Assert.assertEquals(service.giveLong(500000), 1000000, "Value expected is 1000000");
     }
     /////////////////////////////////////////////////////
     
     //Test7//////////////////////////////////////////////
     @Test
     public void checkSame(){
         Assert.assertSame(std, std);
     }
     /////////////////////////////////////////////////////
     
     //Test8//////////////////////////////////////////////
     @Test
     public void checkNotSame(){
         Assert.assertNotSame(z1, z2, "Checking if object are not the same");
     }
     /////////////////////////////////////////////////////

     //Test9//////////////////////////////////////////////
     @Test
     public void checkTrue(){
         Assert.assertTrue(service.check(1, 1));
         Assert.assertTrue(service.check(1, 1), "Check if value is equal to true, incase of false assert will fail!");
     }
     /////////////////////////////////////////////////////

     //Test10/////////////////////////////////////////////
     @Test
     public void checkFalse(){
         Assert.assertFalse(service.giveFalse(1000));
         Assert.assertFalse(service.giveFalse(1000), "Expect a the function to fail inorder to work");
     }
     /////////////////////////////////////////////////////
     
     //Test11/////////////////////////////////////////////
     @Test
     public void checkNull(){
         Assert.assertNull(service.checkNull(null));
         Assert.assertNull(service.checkNull(null), "Test if function test return null");
     }
     /////////////////////////////////////////////////////
     
     //Test12/////////////////////////////////////////////
     @Test
     public void checkNotNull(){
         Assert.assertNotNull(service.checkNotNull("a"));
         Assert.assertNotNull(service.checkNotNull("a"), "Test if test return not null");
     }
     /////////////////////////////////////////////////////
     
     //Test13/////////////////////////////////////////////
     //@Test
     //public void testMe() {
     //       fail("should be true because bla bla bla");
     //}
    
     /////////////////////////////////////////////////////
     
     //Test14/////////////////////////////////////////////
     //@Test
     //public void checkArray(){
         //Assert.assertEquals(null, null, null);
     //}
     /////////////////////////////////////////////////////
     //
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (CalculatorService)ctx.getBean("calc");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
