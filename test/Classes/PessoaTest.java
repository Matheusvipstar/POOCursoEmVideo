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
public class PessoaTest {
    
    public PessoaTest() {
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
     * Test of fazerAniversario method, of class Pessoa.
     */
    @Test
    public void testFazerAniversario() {
        System.out.println("fazerAniversario");
        Pessoa instance = new PessoaImpl();
        instance.fazerAniversario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoa instance = new PessoaImpl();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Pessoa instance = new PessoaImpl();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdade method, of class Pessoa.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        Pessoa instance = new PessoaImpl();
        int expResult = 0;
        int result = instance.getIdade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdade method, of class Pessoa.
     */
    @Test
    public void testSetIdade() {
        System.out.println("setIdade");
        int idade = 0;
        Pessoa instance = new PessoaImpl();
        instance.setIdade(idade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Pessoa.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Pessoa instance = new PessoaImpl();
        char expResult = ' ';
        char result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Pessoa.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        char sexo = ' ';
        Pessoa instance = new PessoaImpl();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pessoa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pessoa instance = new PessoaImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PessoaImpl extends Pessoa {
    }
    
}
