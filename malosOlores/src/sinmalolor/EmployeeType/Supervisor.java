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
public class Supervisor extends Employee {
    
    public Supervisor(String Nombre, String Apellido, String Cedula) {
        super(Nombre, Apellido, Cedula);
    }
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public float cs(){
         float valueS= this.getSalary() + (this.getBonusPercentage() * 0.5F);
         return this.getMoth() % 2 == 0 ? valueS : valueS + this.getRmu() / 12 * 2;
    }
    //calcula el bonus anual
    public float CalculateYearBonus() {
         return this.getSalary() + this.getSalary() * 0.7F;
    }
}
