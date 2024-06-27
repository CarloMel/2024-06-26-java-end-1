public class Manager extends Impiegato{
    
    private int bonus;

    public Manager (String name,String lastName,int salario,int bonus) {
        super(name, lastName, salario);
        setBonus(bonus);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Stipendio annuale manager: " + (getSalario() * 12 + getBonus()) ;
    }
}
