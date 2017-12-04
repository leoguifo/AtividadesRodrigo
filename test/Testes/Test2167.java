/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import URI2167.FalhadoMotor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo
 */
public class Test2167 {
    
    public Test2167() {
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
    
    @Test
    public void test1() {
        System.out.println("3");
        FalhadoMotor motor = new FalhadoMotor();
        int[] teste = {1,4,2};
        int expResult = 3;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2() {
        System.out.println("5");
        FalhadoMotor motor = new FalhadoMotor();
        int[] teste = {100,199,199,198,0};
        int expResult = 4;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3() {
        System.out.println("4");
        FalhadoMotor motor = new FalhadoMotor();
        int[] teste = {1,2,2,2};
        int expResult = 0;
        int result = motor.falha(teste);
        assertEquals(expResult, result);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
