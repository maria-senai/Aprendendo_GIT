/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SESI_SENAI
 */
public class CaesTest {
    Caes dog;
    String nome = "Penny";
    float peso = 6;
    
    public CaesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dog = new Caes(nome, peso);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of falar method, of class Caes.
     */
    @Test
    public void testFalar() {

        System.out.println("falar");
        String mensagem = "Auau";
        String expResult = "Meu nome é " + nome + ", " + mensagem;
        
        String result = dog.falar(mensagem);
        assertEquals(expResult, result);
        

    }

    /**
     * Test of andar method, of class Caes.
     */
    @Test
    public void testAndar() {
        System.out.println("não andar");
        dog.qtd_passos = 1500;
        boolean expResult = false;
        boolean result = dog.andar(10);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testAndar1() {
        System.out.println("Andar 1500 passos");
        boolean expResult = true;
        boolean result = dog.andar(1500);
        assertEquals(expResult, result);
        assertEquals("cansado", dog.humor);
    }
    
    @Test
    public void testAndar2() {
        System.out.println("andar");
        dog.qtd_passos = 15;
        boolean expResult = true;
        boolean result = dog.andar(10);
        assertEquals(expResult, result);

    }

    /**
     * Test of comer method, of class Caes.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        dog.comer();
        assertEquals(dog.peso, peso+ 0.01f, 0);
    }
    
    @Test
    public void testDormirCansado(){
        System.out.println("Dormir Cansado");
        dog.humor = "cansado";
        boolean expResult = true;
        boolean result = dog.dormir();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDormirAnimado(){
        System.out.println("Dormir Animado");
        dog.humor = "animado";
        boolean expResult = false;
        boolean result = dog.dormir();
        assertEquals(expResult, result);
    }


    
}
