/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Employee
{   

    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String provincia;
    private String pais;
    private String ciudad;
    private String direccion;
    private final float rmu = (float) 386.0;
    //salario del employee
    private float salary;
    //porcentaje de bonus
    private float bonusPercentage;    
    //variable de tipo employeeType
    private EmployeeType employeeType;    

    public Employee(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;
        this.Nombre = "Descconocido";
        this.Apellido = "Descconocido";
        this.Cedula = "0000000000";
        this.cambiarDireccion("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
    }
    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public float cs()
    {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        switch (employeeType)         
        {
            case Worker:
                //Si el mes es impar entonces le entrega el decimo junto con su salario
                return month%2==0?salary:salary + rmu/12*2;
            case Supervisor:
                float valueS = salary + (bonusPercentage * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return month%2==0?valueS:valueS + rmu/12*2;
            case Manager:
                float valueM = salary + (bonusPercentage * 0.7F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return month%2==0?valueM:valueM + rmu/12*2;
        }
        return 0.0F;
    }
    //calcula el bonus anual
    public float CalculateYearBonus() 
    {
        switch (employeeType)
        {
            case Worker:
                return 0;
            case Supervisor:
                return salary + salary * 0.7F;
            case Manager:
                return salary + salary * 1.0F;
        }
        return 0.0F;
    }
        /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    public String mostrarDireccion(){
        String dir = pais + " - " + provincia + " - " + ciudad;
        return  dir+ "\n" + direccion;
    }
    
    public void cambiarDireccion(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva){
        pais = nuevoPais;
        ciudad = ciudadnueva;
        provincia = provinciaNueva;
        direccion = direccionNueva;
    }
}
