/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area_triangulo;

/**
 *
 * @author Kelvin
 */
public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    public double calcularArea(){
        return ((this.base * this.altura) / 2);
    }
    
    
    
}
