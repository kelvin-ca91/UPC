/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import area_triangulo.Triangulo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kelvin
 */
public class TestTriangulo {
    Triangulo triangulo;
    
    public TestTriangulo() {
    }
    
    private double base = 3;
    private double altura = 5;
    
    @Before
    public void inicializar(){
        triangulo = new Triangulo(this.base, this.altura);
    }
    
    @Test
    public void calcularAreaTriangulo(){
        double resultado = this.triangulo.calcularArea();
        System.out.println("El área de un triangulo con base "+this.base+ " y altura "+this.altura+" es: "+resultado);
        assertEquals((this.base * this.altura)/2,resultado, 0.00);
    }
}
