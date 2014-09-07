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
public class Area_triangulo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base = 3;
        double altura = 5;
        // TODO code application logic here
        Triangulo triangulo = new Triangulo(base, altura);
        double resultado;
        resultado = triangulo.calcularArea();
        System.out.println("El área de un triangulo con base "+base+ " y altura "+altura+" es: "+resultado);
    }
    
}
