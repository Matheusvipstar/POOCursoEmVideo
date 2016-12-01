/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class TecnicoTest {
    
    public TecnicoTest() {
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
     * Test of praticar method, of class Tecnico.
     */
    @Test
    public void testPraticar() {
        System.out.println("praticar");
        Tecnico instance = new Tecnico();
        instance.praticar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistroProfissional method, of class Tecnico.
     */
    @Test
    public void testGetRegistroProfissional() {
        System.out.println("getRegistroProfissional");
        Tecnico instance = new Tecnico();
        int expResult = 0;
        int result = instance.getRegistroProfissional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistroProfissional method, of class Tecnico.
     */
    @Test
    public void testSetRegistroProfissional() {
        System.out.println("setRegistroProfissional");
        int registroProfissional = 0;
        Tecnico instance = new Tecnico();
        instance.setRegistroProfissional(registroProfissional);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
