/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testjava;

import static com.mycompany.testjava.NewClass.calcDif;
import static com.mycompany.testjava.NewClass.calcSum;
import java.util.function.IntBinaryOperator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KaimaTanaka
 */
public class NewClassTest {
    
    public NewClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcSum method, of class NewClass.
     */
    @Test
    public void testCalcSum() {
        int a = 1;
        int b = 2;
        int expResultSum = 3;
        int resultSum = calcSum(a, b);
        assertEquals(expResultSum, resultSum);
        
        int expResultDif = 1;
        int resultDif = calcDif(b, a);
        assertEquals(expResultDif, resultDif);
    }
    
}
