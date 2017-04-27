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
public class DataTest {
    
    public DataTest() {
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
     * Test of toString method, of class Data.
     */
    
    @Test
    public void adicionarDataInvalida(){
         try {
            Data data = new Data(33,12,2017);
            fail("Data invalida");
        } catch (Exception e) {
        }
        
    }
 

        

    /**
     * Test of parse method, of class Data.
     */
    @Test
    public void testParse() {
        String data = "20/11/2017";
        Data expResult = new Data(20,11,2017);
        Data result = Data.parse(data);
        assertEquals(expResult, result);
    }
    
}
