package herencia01;

public class Empleado extends Persona  {

    protected String departamento;
    protected double salario;
    protected String fechaContrat;

    public Empleado(){

    }

    public Empleado(String nombre, String direccion, String nroTelefono, String correoElectronico, String departamento, double salario, String fechaContrat) {
        super(nombre, direccion, nroTelefono, correoElectronico);
        this.departamento = departamento;
        this.salario = salario;
        this.fechaContrat = fechaContrat;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento == "contabilidad" || departamento == "recursos humanos" || departamento == "compras") {
            this.departamento = departamento;
        } else {
            this.departamento = "recursos humanos";
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaContrat() {
        return fechaContrat;
    }

    public void setFechaContrat(String fechaContrat) {
        this.fechaContrat = fechaContrat;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Departamento del Empleado : "+this.departamento+ "\n"+
                                      "Salario del Empleado : "+this.salario+"\n"+
                                      "Fecha de Contratación del Empleado : "+this.fechaContrat+"\n";
    }
}
