/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor.EmployeeType;

import sinmalolor.Employee;

/**
 *
 * @author Gabriel
 */
public class Worker extends Employee{
    
    public Worker(String Nombre, String Apellido, String Cedula) {
        super(Nombre, Apellido, Cedula);
    }
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public float cs(){
         return this.getMoth()%2==0?this.getSalary():this.getSalary() + this.getRmu()/12*2;
    }
    //calcula el bonus anual
    public float CalculateYearBonus() {
        return  0;
    }
}
