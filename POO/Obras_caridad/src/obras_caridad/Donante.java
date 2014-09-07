/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obras_caridad;

/**
 *
 * @author Kelvin
 */
public class Donante {
    
    /*Variables de entrada*/
    private String dni;
    private String nombre;
    private String telefono;
    private String email;
    private double monto_aportado;
    private String[][] arrDonantes;
    private double monto_mayor;
    
    private int indice_dni;
    private int indice_nombre;
    private int indice_telefono;
    private int indice_email;
    private int indice_monto_aportado;
    
    public Donante(String[][] arrDonantes){
        this.arrDonantes = arrDonantes;
        /*En caso se cambie las posiciones del array, solo se tendria que cambiar
        en este constructor y nada mas. */
        this.indice_dni = 0;
        this.indice_nombre = 1;
        this.indice_telefono = 2;
        this.indice_email = 3;
        this.indice_monto_aportado = 4;
    }
/*
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
    public double getMonto_mayor(){
        return this.monto_mayor;
    }
    public void setMonto_mayor(double monto_mayor ){
        this.monto_mayor = monto_mayor;
    }
*/
    public double montoTotalRecaudado(){
        this.monto_aportado = 0;
        for(int i=0; i< this.arrDonantes.length; i++ ){
            this.monto_aportado += Double.parseDouble(this.arrDonantes[i][this.indice_monto_aportado]);
        }
        return this.monto_aportado;
    }
    
    public String mayorAportante(){
        this.monto_mayor = 0;
        for(int i=0; i< this.arrDonantes.length; i++ ){
            if( this.monto_mayor < Double.parseDouble(this.arrDonantes[i][this.indice_monto_aportado])){
                this.monto_mayor = Double.parseDouble(this.arrDonantes[i][indice_monto_aportado]);
                this.nombre=this.arrDonantes[i][indice_nombre];
            }
        }
        return this.nombre;
    }   
    
    public String buscarDonante(String dniBusqueda){
        this.dni = "";
        String rpta;
        for(int i=0; i< this.arrDonantes.length; i++ ){
            if(dniBusqueda == this.arrDonantes[i][this.indice_dni]){
                this.dni = this.arrDonantes[i][this.indice_dni];
                this.nombre = this.arrDonantes[i][this.indice_nombre];
                this.telefono = this.arrDonantes[i][this.indice_telefono];
                this.email = this.arrDonantes[i][this.indice_email];
                this.monto_aportado = Double.parseDouble(this.arrDonantes[i][this.indice_monto_aportado]);
            }
        }
        if(this.dni != "")
            rpta = ("El donante de DNI "+this.dni+" es:"+
                            "\n\t Nombre: "+ this.nombre+
                            "\n\t Telefono: "+this.telefono+
                            "\n\t Email: "+this.email+
                            "\n\t Monto aportado: "+this.monto_aportado);
        else
            rpta = ("No se encontro registros del DNI: "+dniBusqueda);
        
        return rpta;
    }
    
    public double promedioRecaudado(){
        return montoTotalRecaudado() / this.arrDonantes.length ;
    }  
}
