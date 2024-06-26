public class Prenotazione {
// * ES1: Sistema di Prenotazioni
// * 
// * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
// * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
// * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
// * Implementa metodi per prenotare un posto, annullare la prenotazione e
// * verificare se un o piu' posti sono disponibili.
    private boolean[] postiDisponibili;

    public Prenotazione (int capienzaMax) {
        
        setPostiDisponibili(postiDisponibili = new boolean[capienzaMax]);
    }

    public boolean[] getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiDisponibili(boolean[] postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public void verificaPrenotazioni () {

        int totaleLiberi = 0;


        System.out.println("Posti attualmente liberi: ");

        for (int x = 0; x < postiDisponibili.length; x++) {
            if (postiDisponibili[x] == false) {
                System.out.print(" " + x + "° ");
                totaleLiberi++;
            }
        }

        System.out.println("Totale posti liberi: " + totaleLiberi);
    }

    public void aggiungiPrenotazioni (int numeroPrenotazioni) {

        for (int x = 0; x < numeroPrenotazioni; x++) {

            if (postiDisponibili[x] == false) {

                postiDisponibili[x] = true;
                System.out.println("Prenotazione effettuata!"
                + "\n" + "Il tuo posto è: " + (x + 1) + "°");
            } else {
                numeroPrenotazioni++;
            }
        };
    }

    public void annullaPrenotazione(int indexDaAnnullare) {

        boolean index = getPostiDisponibili()[indexDaAnnullare];

        if (index == true) {
            getPostiDisponibili()[indexDaAnnullare] = false;
            System.out.println("Annullata la prenotazione al " + (indexDaAnnullare + 1) + "° posto"); 
        } else {
            System.out.println("Il " + (indexDaAnnullare + 1) + "° posto è già disponibile");
        }

    }

    @Override
    public String toString() {

        String stringToReturn = "";
        int index = 1;

        for (boolean x: getPostiDisponibili()) {
            stringToReturn += index + "." + x + " ";
            index++;
        }
        
        return "Riassunto prenotazioni teatro: " + "\n" + stringToReturn;
    }
}
