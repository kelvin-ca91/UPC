/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obras_caridad;

/**
 *
 * @author Kelvin Carrion Alfaro
 */
public class Obras_caridad {

    /**
     * @param args the command line arguments
     */
    public double monto_recaudado;
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] arrDonantes ={
                                {"32165482","Kelvin","993197008","kelvin@gmail.com","31"}, 
                                {"51247865","Andrea","993545482","andrea@gmail.com","42.5"},
                                {"12345678","Diego","4251365","diego@gmail.com","20"}
                                };
        //System.out.println(arrDonantes.length);
        
        Donante donante = new Donante(arrDonantes);
        System.out.println("1.- El monto total que se ha recaudado: "+ donante.montoTotalRecaudado());
        System.out.println("2.- El nombre de la persona que aportó más: "+ donante.mayorAportante());
        System.out.println("3.- "+ donante.buscarDonante("32165482"));
        System.out.println("4.- El nombre de la persona que aportó más: "+ donante.promedioRecaudado());
        
        /*
        Donante donante = new Donante();
        donante.setDni("46781964");
        System.err.println(odnante.montoTotalRecaudado());
        */
    }
    
}
