/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import URI1789.CorridadeLesmas;
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
public class Test1789 {
    
    public Test1789() {
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
    public void testarVerificarRank1(){
        int lesmas[] = {10,10,10,10,15,18,20,15,11,10};
        CorridadeLesmas CL = new CorridadeLesmas();
        assertEquals(3, CL.verificarVelocidades(lesmas));
    }
    
    @Test
    public void testarVerificarRank2(){
        int lesmas[] = {1,5,2,9,5,5,8,4,4,3};
        CorridadeLesmas CL = new CorridadeLesmas();
        assertEquals(1, CL.verificarVelocidades(lesmas));
    }
    
    @Test
    public void testarVerificarRank3(){
        int lesmas[] = {19,9,1,4,5,8,6,11,9,7};
        CorridadeLesmas CL = new CorridadeLesmas();
        assertEquals(2, CL.verificarVelocidades(lesmas));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
