/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import java.util.ArrayList;
import java.util.List;




public class Empresa {
    
    private List<Cliente> clientes;
    private List<Employee> empleados;
    
    public Empresa(){
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Employee>();
    }
    //pasar a la clase cliente
    public void MostrarInformacion(Persona p){
        if(p instanceof Cliente){
            System.out.println("Cliente:");
        }else{
            System.out.println("Empleado:");
        }
        System.out.println("Nombre: " + p.getNombre() + ", Apellido: " + p.getApellido()+ ", con numero de cedula: " + p.getCedula() );
        System.out.println("Direccion: " + p.mostrarLocation());
        System.out.println("----------------------");
    }
    //hacer que reciba un cliente y llamar solo a la funcion de validacion
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        // if (validarInfo)
        validarInformacion(Nombre,Apellido,Cedula);
        //else se guarda
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        cliente.setLocation("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa");
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + " ha sido agregado como nuevo cliente");
    }
    // crear funcion guardar empleado
    
    // recibir el cliente hacer una verificación en una sola lnea y que retorne un boolean
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        if((Nombre.equals("") && Nombre.length()> 16) && (Apellido.equals("") && Apellido.length()> 16)){
            System.out.println("ingreso de nombre o apellido incorrecto");
        }else{
            System.out.println("ingreso de nombre y apellido correcto");
        }
        if(!Cedula.equals("") && Cedula.length()< 10){
            System.out.println("ingreso de cedula incorrecto");
        }else{
            System.out.println("ingreso de cedula correcto");   
        }   
    }
    
    public void mostrarTodo() {
        //Mostrar los clientes 
        for(Cliente cliente : this.clientes){
            MostrarInformacion(cliente);           
        }
        //Mostrar los empleados 
        for(Employee empleado : this.empleados){
            this.MostrarInformacion(empleado);           
        }
    }
}
