package platzi;

public class Paciente {
    int id;
    private String name;
    private String email;
    private String direccion;
    private String numeroTel;
    private String cumpleaños;
    private double peso;
    private double altura;
    private String tipoSangre;

    Paciente(String name,String email){
        this.name = name;
        this.email = email;
    }

    public String getPeso() {
        return peso + "kgs";
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura + "mts";
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        if (numeroTel.length()>8){
            System.out.println("La cantidad máxima de dígitos es de 8");
        } else if (numeroTel.length()==8){
        }   this.numeroTel = numeroTel;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
}
