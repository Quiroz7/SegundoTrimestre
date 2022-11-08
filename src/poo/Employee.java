package poo;

public class Employee {

    float salary = 0;
    float numeroHours = 0;

    String name = "";

    Employee(){
    }

    public Employee(float salary, float numeroHours, String name) {
        this.salary = salary;
        this.numeroHours = numeroHours;
        this.name = name;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getNumeroHours() {
        return numeroHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumeroHours(float numeroHours) {
        this.numeroHours = numeroHours;
    }

    public static void obtenerInformacion(float salary, float numeroHours){

    }
    public  float agregarSalario (float salary){

        return salary < 500000 ? salary+10000 : 0;
    }
    public  float agregarTrabajo (float salary, float numeroHours){

        return numeroHours > 6 ? salary+50000:0;
    }

    @Override
    public String toString() {
        return  name +
                " con salario de: "+salary+" y un número de horas de: "+numeroHours+"\n"
                + "recibe: " + (agregarSalario(this.salary+agregarTrabajo(this.salary,this.numeroHours))) + " pesos " +
                ", y un aumento por las horas extras de: "+"\n"+
                agregarTrabajo(this.salary,this.numeroHours)+
                '}';
    }
}

