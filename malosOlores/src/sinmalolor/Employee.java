/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Employee extends Persona {

    private final float rmu = (float) 386.0;
    //salario del employee
    private float salary;
    //porcentaje de bonus
    private float bonusPercentage;
    //variable de tipo employeeType

    public Employee(String Nombre, String Apellido, String Cedula) {
        super(Nombre, Apellido, Cedula);
    }

    //esta funcion debe ir en otra clase que se dedique a esto
    public void manejarSalario(Employee emp, float salary, float bonusPercentage) {
        emp.setSalary(salary);
        emp.setBonusPercentage(bonusPercentage);
        emp.setLocation("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
    public float getRmu() {
        return rmu;
    }
    public int getMoth() {
        //Obtiene el mes en forma de entero
        return new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
    }
}
