/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LeoHR
 */
public class CalculadoraTest {
    
    @Test
    void testGetSoma(){
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    
    @Test
    void testGetDiferenca(){
         Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDiferenca();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    @Test
    void testGetProduto(){
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 8.0;
        double retornoFeito = calculadora.getProduto();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    @Test
    void TestGetQuociente(){
       Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getQuociente();
        assertEquals(retornoEsperado, retornoFeito, 0); 
    }
    @Test
    void testConstrutorPadraoInicializaComZero() {
        Calculadora calc = new Calculadora();

        assertEquals(0.0, calc.getValorA(), "Valor A deve ser 0.0");
        assertEquals(0.0, calc.getValorB(), "Valor B deve ser 0.0");
    }
}
    

