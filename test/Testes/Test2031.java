/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import URI2031.PedraPapelAtaqueAereo;
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
public class Test2031 {
    
    public Test2031() {
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
        System.out.println("Teste Pedra vs Pedra");
        PedraPapelAtaqueAereo jokenpo = new PedraPapelAtaqueAereo();
        String[] teste = {"pedra", "pedra"};
        int expResult = 3;
        int result = jokenpo.verificarVencedor(teste);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test2() {
        System.out.println("Teste Ataque vs Papel");
        PedraPapelAtaqueAereo jokenpo = new PedraPapelAtaqueAereo();
        String[] teste = {"ataque", "papel"};
        int expResult = 1;
        int result = jokenpo.verificarVencedor(teste);
        assertEquals(expResult, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
