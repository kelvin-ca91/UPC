
package obras_caridad;

/**
 *
 * @author Kelvin Carrion Alfaro
 */
public class Donante {
    
    private String dni;
    private String nombre;
    private String telefono;
    private String email;
    private double monto_aportado;
    
    public Donante(){   
    }

    public String getDni(){
        return this.dni;
    }    
    public void setDni(String dni){
        this.dni = dni;
    }    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getMonto_aportado(){
        return this.monto_aportado;
    }
    public void setMonto_aportado(double monto_aportado){
        this.monto_aportado = monto_aportado;
    }
}