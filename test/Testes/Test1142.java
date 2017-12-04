/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import URI1142.PUM;
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
public class Test1142 {
    
    public Test1142() {
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
    public void teste1(){
        PUM pum = new PUM();
        assertEquals("1 2 3 PUM\n" +
        "5 6 7 PUM\n" +
        "9 10 11 PUM\n" +
        "13 14 15 PUM\n" +
        "17 18 19 PUM\n" +
        "21 22 23 PUM\n" +
        "25 26 27 PUM\n", pum.gerarSequencia(7));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
