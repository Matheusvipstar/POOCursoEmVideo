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
public class BolsistaTest {
    
    public BolsistaTest() {
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
     * Test of RenovarBolsa method, of class Bolsista.
     */
    @Test
    public void testRenovarBolsa() {
        System.out.println("RenovarBolsa");
        Bolsista instance = new Bolsista();
        instance.RenovarBolsa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PagarMensalidade method, of class Bolsista.
     */
    @Test
    public void testPagarMensalidade() {
        System.out.println("PagarMensalidade");
        Bolsista instance = new Bolsista();
        instance.PagarMensalidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBolsa method, of class Bolsista.
     */
    @Test
    public void testGetBolsa() {
        System.out.println("getBolsa");
        Bolsista instance = new Bolsista();
        float expResult = 0.0F;
        float result = instance.getBolsa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBolsa method, of class Bolsista.
     */
    @Test
    public void testSetBolsa() {
        System.out.println("setBolsa");
        float bolsa = 0.0F;
        Bolsista instance = new Bolsista();
        instance.setBolsa(bolsa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
