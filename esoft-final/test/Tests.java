/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gestor.DadosAplicacao;
import modelos.Data;
import modelos.Horario;
import modelos.PontoPassagem;
import modelos.Utilizador;
import modelos.Viagem;
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
public class Tests {
    
    public Tests() {
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
    
    @Test
    public void testAdicionarDataInvalida(){
         try {
            Data data = new Data(33,12,2017);
            fail("Data invÃ¡lida");
        } catch (Exception e) {
        }
        
    }
 
    @Test
    public void testParseData() {
        String data = "20/11/2017";
        Data expResult = new Data(20,11,2017);
        Data result = Data.parse(data);
        assertEquals("Data criada invÃ¡lidamente no parse",expResult, result);
    }
    
    @Test
    public void testAdicionarHoraInvalida(){
         try {
            Horario hora = new Horario(33,12);
            fail("Hora invÃ¡lida");
        } catch (Exception e) {
        }
        try {
            Horario hora = new Horario(12,66);
            fail("minuto invÃ¡lido");
        } catch (Exception e) {
        }
    }
 
    @Test
    public void testParseHora() {
        String hora = "12:30";
        Horario expResult = new Horario(12,30);
        Horario result = Horario.parse(hora);
        assertEquals("Horario criado invÃ¡lidamente no parse",expResult, result);
    }
    
    @Test
    public void testCriacaoPontoPassagemSemNome() {
        try{
            PontoPassagem ponto = new PontoPassagem(null, new Horario(12, 30), 10.00);
            fail("Criou um ponto passagem sem nome");
        } catch(Exception e) {
            
        }
    }
    
    @Test
    public void testCriacaoPontoPassagemComCustoInvalido() {
        try{
            PontoPassagem ponto = new PontoPassagem("Lisboa", new Horario(12, 30), -1.00);
            fail("Criou um ponto de passagem com custo menor que 0");
        } catch(Exception e) {
            
        }
    }
    
    @Test
    public void testCriacaoPontoPassagemSemHorario() {
        try{
            PontoPassagem ponto = new PontoPassagem("Lisboa", null, 10.00);
            fail("Criou um ponto de passagem sem horario");
        } catch(Exception e) {
            
        }
    }
    
    @Test
    public void testAdicionarViagemSemPontosPassagem(){
        try{
            Viagem viagem=new Viagem(null, 3, new Utilizador("Paulo", "123"));            
            DadosAplicacao.getGestor().adicionarViagem(viagem); 
            fail("Adicionou uma viagem sem pontos de passagem!");
        } catch(Exception e) {
            
        }
    }
}
