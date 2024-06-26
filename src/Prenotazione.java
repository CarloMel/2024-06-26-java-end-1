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

    // public boolean[] verificaPrenotazioni () {

        // boolean[] riassuntoPrenotazioni = new boolean[];

        // return riassuntoPrenotazioni;
    // }

    public void aggiungiPrenotazione () {

        // postiTeatro.add
    }

    public void annullaPrenotazione() {

    }

    @Override
    public String toString() {

        String stringToReturn = "";
        int index = 1;

        for (boolean x: getPostiDisponibili()) {
            stringToReturn += index + "." + x + " ";
            index++;
        }

        return "Resoconto posti teatro: " + "\n"
        + stringToReturn;
    }
}
