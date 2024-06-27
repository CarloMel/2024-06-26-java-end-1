public class Impiegato extends Persona{
    
    private int salario;

    public Impiegato (String name,String lastName,int salario) {

        super(name, lastName);
        setSalario(salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void aumentaSalario(int percentuale) {

        int valoreFinale = getSalario() + (getSalario() * percentuale / 100);
        setSalario(valoreFinale);
    }

    @Override
    public String toString() {
        return "Stipendio annuale impiegato: " + (getSalario() * 13);
    }
}
