/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerEjercicioPractica;

import com.sun.xml.internal.bind.v2.ClassFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Noe
 */
public class FactorialTest {
    
    public FactorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass()throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 0;
        int expResult = 0;
        int result = Factorial.calculo(n);
        assertEquals(1, Factorial.calculo(0));
        assertTrue(1==Factorial.calculo(1));
        assertEquals(24, Factorial.calculo(4));
        assertEquals(720, Factorial.calculo(6));
        boolean excepcionLanzada = false;
        try {
            Factorial.calculo(-1);
        } catch (IllegalArgumentException e){
            excepcionLanzada = true;
        }
        assertTrue(excepcionLanzada);
        }
     
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
