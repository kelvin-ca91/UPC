
package obras_caridad;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Kelvin Carrion Alfaro
 */
public class Obras_caridad {

    public static void main(String[] args) {
        // TODO code application logic here
        String[][] arrDonantes ={
                                {"32165482","Kelvin","993197008","kelvin@gmail.com","31"}, 
                                {"51247865","Andrea","993545482","andrea@gmail.com","42.5"},
                                {"12345678","Diego","4251365","diego@gmail.com","20"}
                                };
        
        ArrayList<Donante> donantes = new ArrayList<Donante>();
        for(int i=0; i< arrDonantes.length; i++ ){
            Donante donante = new Donante();
            donante.setDni(arrDonantes[i][0]);
            donante.setNombre(arrDonantes[i][1]);
            donante.setTelefono(arrDonantes[i][2]);
            donante.setEmail(arrDonantes[i][3]);
            donante.setMonto_aportado( Double.parseDouble(arrDonantes[i][4]));
            donantes.add(donante);
        }
        
        Fundacion fundacion = new Fundacion();
        System.out.println("1.- El monto total que se ha recaudado: "+ fundacion.montoTotalRecaudado(donantes));
        System.out.println("2.- El nombre de la persona que aportó más: "+ fundacion.mayorAportante(donantes));
        System.out.println("3.- "+ fundacion.buscarDonante("32165482", donantes));
        System.out.println("4.- El promedio de dinero recaudado: "+ fundacion.promedioRecaudado(donantes));    
    }
}
