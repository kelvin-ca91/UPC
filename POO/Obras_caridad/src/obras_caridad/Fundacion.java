
package obras_caridad;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kelvin Carrion Alfaro
 */
public class Fundacion {
    
    private Iterator<Donante> itrDonantes;
    private Donante donante;
    
    public Fundacion(){
    }
    
    public double montoTotalRecaudado(ArrayList donantes){
        itrDonantes = donantes.iterator();
        double monto_total = 0;
        while(itrDonantes.hasNext()){
            Donante donante = itrDonantes.next();
            monto_total+= donante.getMonto_aportado();
        }
        return monto_total;
    }
    
    public String mayorAportante(ArrayList donantes){
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
        return nombre;
    }   
    
    public String buscarDonante(String dniBusqueda, ArrayList donantes){
        itrDonantes = donantes.iterator();
        String rpta = "";
        while(itrDonantes.hasNext()){
            Donante donante = itrDonantes.next();
            if(dniBusqueda == donante.getDni()){
                rpta = ("El donante de DNI "+donante.getDni()+" es:"+
                            "\n\t Nombre: "+ donante.getNombre()+
                            "\n\t Telefono: "+donante.getTelefono()+
                            "\n\t Email: "+donante.getEmail()+
                            "\n\t Monto aportado: "+donante.getMonto_aportado());
            }
        }
        if(rpta == ""){
            rpta = "No se encontro registros del DNI: "+dniBusqueda;
        }
        return rpta;
    }
    
    public double promedioRecaudado(ArrayList donantes){
        return montoTotalRecaudado(donantes) / donantes.size() ;
    } 
}
