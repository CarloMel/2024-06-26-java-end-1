import java.util.ArrayList;
import java.util.List;



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

    public String verificaPrenotazioni () {

        String stringToReturn = "";
        int index = 1;

        for (boolean x: getPostiDisponibili()) {
            stringToReturn += index + "." + x + " ";
            index++;
        }

        return stringToReturn;
    }

    public void aggiungiPrenotazioni (int numeroPrenotazioni) {

        for (int x = 0; x < numeroPrenotazioni; x++) {

            if (postiDisponibili[x] == false) {

                postiDisponibili[x] = true;
                System.out.println("Prenotazione effettuata!"
                + "\n" + "Il tuo posto è: " + (x + 1) + "°");
            } else {
                // se il posto è già preso  e faccio 8 prenotazioni, ne prenota 7.
            }
        };
    }

    public void annullaPrenotazione() {

    }

    @Override
    public String toString() {

        return "Riassunto prenotazioni teatro: " + "\n" + verificaPrenotazioni();
    }
}
