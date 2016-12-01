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
public class AlunoTest {
    
    public AlunoTest() {
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
     * Test of PagarMensalidade method, of class Aluno.
     */
    @Test
    public void testPagarMensalidade() {
        System.out.println("PagarMensalidade");
        Aluno instance = new Aluno();
        instance.PagarMensalidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Aluno instance = new Aluno();
        int expResult = 0;
        int result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Aluno.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        int matricula = 0;
        Aluno instance = new Aluno();
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurso method, of class Aluno.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurso method, of class Aluno.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        String curso = "";
        Aluno instance = new Aluno();
        instance.setCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
