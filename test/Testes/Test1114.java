/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import URI1114.SenhaFixa;
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
public class Test1114 {
    
    public Test1114() {
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
        System.out.println("Digitando senha 2200");
        SenhaFixa verifica = new SenhaFixa();
        int expResult = 0; // Retorna que a senha é invalida
        int result = verifica.Senha(2200);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("Digitando senha 1020");
        SenhaFixa verifica = new SenhaFixa();
        int expResult = 0; // Retorna que a senha é invalida
        int result = verifica.Senha(1020);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste3(){
        System.out.println("Digitando senha 2022");
        SenhaFixa verifica = new SenhaFixa();
        int expResult = 0; // Retorna que a senha é invalida
        int result = verifica.Senha(2022);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste4(){
        System.out.println("Digitando senha 2002");
        SenhaFixa verifica = new SenhaFixa();
        int expResult = 1; // Acesso permitido
        int result = verifica.Senha(2002);
        assertEquals(expResult, result);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
