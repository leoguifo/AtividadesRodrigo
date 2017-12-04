package Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import URI1042.SortSimples;
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
public class Test1042 {
    
    public Test1042() {
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
    public void testarOrdenarNumeros(){
        int numeros[] = {7,21,-14};
        int numerosesp[] = {-14,7,21};
        int numerosret[];
        SortSimples SS = new SortSimples();
        numerosret=SS.ordenarValores(numeros);
        
        assertArrayEquals(numerosesp, numerosret);
    }
    
    @Test
    public void testarOrdenarNumeros2(){
        int numeros[] = {-14,21,7};
        int numerosesp[] = {-14,7,21};
        int numerosret[];
        SortSimples SS = new SortSimples();
        numerosret=SS.ordenarValores(numeros);
        
        assertArrayEquals(numerosesp, numerosret);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
