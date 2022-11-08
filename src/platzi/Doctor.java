package platzi;

public class Doctor {
    static  int id = 0;
    String nombre;
    String especialidad;
    String email;

    Doctor(){
    }

    Doctor(String nombre,String especialidad){
        System.out.println("El nombre del doctor asignado es: "+ nombre);
        id++;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }


    public  void showid(){
        System.out.println("ID Doctor: " + id);
    }






}

