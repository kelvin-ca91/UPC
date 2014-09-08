/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.ArrayList;
import java.util.Iterator;
import obras_caridad.Donante;
import obras_caridad.Fundacion;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Kelvin
 */
public class TestObrasCaridad {
    
    Fundacion fundacion;

    private String[][] arrDonantes ={
        {"32165482","Kelvin","993197008","kelvin@gmail.com","31"}, 
        {"51247865","Andrea","993545482","andrea@gmail.com","42.5"},
        {"12345678","Diego","4251365","diego@gmail.com","20"}
    };
    private ArrayList<Donante> donantes = new ArrayList<Donante>();
    private Iterator<Donante> itrDonantes;
    
    public TestObrasCaridad() {
    }
    

    @Before
    public void inicializar(){
        for(int i=0; i< arrDonantes.length; i++ ){
            Donante donante = new Donante();
            donante.setDni(arrDonantes[i][0]);
            donante.setNombre(arrDonantes[i][1]);
            donante.setTelefono(arrDonantes[i][2]);
            donante.setEmail(arrDonantes[i][3]);
            donante.setMonto_aportado( Double.parseDouble(arrDonantes[i][4]));
            donantes.add(donante);
        }
    }
    
    @Test
    public void montoTotalRecaudado(){
        
        Fundacion fundacion = new Fundacion();
        double totalRecaudado = fundacion.montoTotalRecaudado(donantes);
        System.out.println("1.- El monto total que se ha recaudado: "+ totalRecaudado );
        
        itrDonantes = donantes.iterator();
        double monto_total = 0;
        while(itrDonantes.hasNext()){
            Donante donante = itrDonantes.next();
            monto_total+= donante.getMonto_aportado();
        }
        assertEquals(monto_total, totalRecaudado, 0.00);
    }
    
    @Test
    public void mayorAportante(){
        Fundacion fundacion = new Fundacion();
        String mayorAportante = fundacion.mayorAportante(donantes);
        System.out.println("2.- El nombre de la persona que aportó más: "+ fundacion.mayorAportante(donantes));
        itrDonantes = donantes.iterator();
        double monto_mayor = 0;
        String nombre = "";
        while(itrDonantes.hasNext()){
            Donante donante = itrDonantes.next();
            if( donante.getMonto_aportado() > monto_mayor ){
                monto_mayor = donante.getMonto_aportado();
                nombre = donante.getNombre();
            }
        }
        assertEquals(nombre, mayorAportante);
    }
    
    @Test
    public void buscarDonante(){
        Fundacion fundacion = new Fundacion();
        double promedioRecaudado = fundacion.promedioRecaudado(donantes);
        System.out.println("4.- El promedio de dinero recaudado: "+ fundacion.promedioRecaudado(donantes));    
        itrDonantes = donantes.iterator();
        double promedio = fundacion.montoTotalRecaudado(donantes) / donantes.size() ;
        assertEquals(promedio, promedioRecaudado, 0.00);
    }
}

