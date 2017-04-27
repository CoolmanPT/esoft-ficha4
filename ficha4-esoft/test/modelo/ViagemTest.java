/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno
 */
public class ViagemTest {
    
    public ViagemTest() {
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
     * Test of adicionarPonto method, of class Viagem.
     */
@Test
    public void testCriacaoViagemSemData() {
        try{
            Viagem viagem=new Viagem(null, 3, new Utilizador("Paulo", "123"));
            fail("Criou uma viagem sem data");
        } catch(Exception e) {
            
        }
    }
    
    @Test
    public void testCriacaoViagemComOcupacaoInvalida() {
        try{
            Viagem viagem=new Viagem(new Data(26, 10, 2016), 0, new Utilizador("Paulo", "123"));
            fail("Criou uma viagem com ocupaÃ§Ã£o menor que 1");
        } catch(Exception e) {
            
        }
    }
    
    @Test
    public void testCriacaoViagemSemUtilizador() {
        try{
            Viagem viagem=new Viagem(new Data(26, 10, 2016), 3, null);
            fail("Criou uma viagem sem utilizador");
        } catch(Exception e) {
            
        }
    }
    
}
