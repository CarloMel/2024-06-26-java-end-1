// * ES3: Simulatore di Banca
// * 
// * Definisci una classe ContoBancario con metodi per depositare denaro,
// * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
// * tenta di prelevare più denaro di quanto disponibile con un'eccezione.

public class ContoBancario {

    private int sommaInDeposito;

    public ContoBancario() {

        setSommaInDeposito(getSommaInDeposito());
    }

    public int getSommaInDeposito() {
        return sommaInDeposito;
    }

    public void setSommaInDeposito(int sommaInDeposito) {
        this.sommaInDeposito = sommaInDeposito;
    }

    public void depositaDenaro (int somma) {

        try{
            
            if (somma <= 0) {
                throw new Exception("Non puoi depositare una quantità inferiore o uguale a 0");
            }

            setSommaInDeposito(getSommaInDeposito() + somma);

            System.out.println("Hai depositato: " + somma + " euro");
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public void prelevaDenaro(int somma) {

        try {

            if (somma > getSommaInDeposito()) {
                throw new Exception("Non puoi ritirare una somma maggiore di quella di cui disponi"
                + "(" + getSommaInDeposito() + " euro)");
            }

            setSommaInDeposito(getSommaInDeposito() - somma);

            System.out.println("Hai prelevato: " + somma + " euro");
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }

    public String ottieniSaldo() {

        return "Il tuo conto è di " +  getSommaInDeposito();
    }

    @Override
    public String toString() {
        return "Conto bancario: " + "\n" + ottieniSaldo() + " euro";
    }
}