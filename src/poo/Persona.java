package poo;

public class Persona {
    private String documento = "";
    private String nombre = "";
    private int edad = 0;
    private char sexo = 'm';
    private double peso = 0 ;
    private double altura = 0;

    public Persona(){
    }

    public Persona(String documento, String nombre, int edad, char sexo) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String documento, String nombre, int edad, char sexo, double peso, double altura) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char  getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'm' || sexo == 'f') {
            this.sexo = sexo;
        } else {

            this.sexo = 'm';
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String mayorEdad(){
        return  this.edad >= 18? " Eres mayor de edad ": " Eres menor de edad ";

    }

    public String calcularimc(){
        double imc = this.peso/Math.pow(this.altura,2);
        return imc < 18.5? " Está por debajo del peso " : imc >= 18.5 && imc <= 24.9? " Está normal": imc >=25 && imc <=29.9?"Con sobrepeso":imc >=30 && imc <= 39.9?"Tiene obesidad":"Pilas, tiene obesidad extrema";
    }

    @Override
    public String toString() {
        return "Hola " + nombre + "\n"+
                " su identificación es: " + documento + "\n"
                + "su edad es de " + edad + " años "+ " y " + mayorEdad()+"\n"+
                  "su género es: " + sexo + " . \n"+
                  " tu peso actualmente es de: " + peso + " kgs \n"+
                  " y su estatura es: " + altura + " cms \n"+
                  " al calcular tu IMC, tu estado es: "+calcularimc();
    }
}



