/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor;


public class Cliente {
    public String Nombre;
    public String Apellido;
    public String Cedula;
    private String provincia;
    private String pais;
    private String ciudad;
    private String direccion;
    private String telefono;
    
    public Cliente(String Nombre, String Apellido, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String mostrarLocation(){
        String dir = pais + " - " + provincia + " - " + ciudad;
        return  dir+ "\n" + direccion;
    }
    
    public void setLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        pais = nuevoPais;
        ciudad = ciudadnueva;
        provincia = provinciaNueva;
        direccion = direccionNueva;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
