/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import URI1960.NumeracaoRomana;
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
public class Test1960 {
    
    public Test1960() {
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
    public void testarNumeroRomanos1(){
        NumeracaoRomana NR = new NumeracaoRomana();
        
        assertEquals("DCLXVI", NR.getRomanos("666"));
    }
    
    @Test
    public void testarNumeroRomanos2(){
        NumeracaoRomana NR = new NumeracaoRomana();
        
        assertEquals("LXXXIII", NR.getRomanos("83"));
    }
    
    @Test
    public void testarNumeroRomanos3(){
        NumeracaoRomana NR = new NumeracaoRomana();
        
        assertEquals("CMXCIX", NR.getRomanos("999"));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
