/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor;

/**
 *
 * @author djurado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();
        miEmpresa.GuardarCliente("Alberto", "Castillo", "0987678711");
        miEmpresa.GuardarCliente("Ana", "Vera", "1780982211");
        miEmpresa.GuardarCliente("Diana", "Andrade", "1209339980");
        miEmpresa.empleados.add(new Employee(450.0f, 0.05f, EmployeeType.Worker));
        miEmpresa.mostrarTodo();
    }
    
}
