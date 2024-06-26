// * ES4: Elenco Telefonico
// * 
// * Implementa una classe Contatto che rappresenti un contatto telefonico con
// * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che gestisca una
// * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
// * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
// * telefono non validi.

import java.util.ArrayList;
import java.util.List;

public class ElencoTelefonico {
    
    private List<Contatto> listaContatti = new ArrayList<>();

    public void aggiungiContatto(Contatto contatto) {

        listaContatti.add(contatto);
    }

    public void rimuoviContatto(Contatto contatto) {

        listaContatti.remove(listaContatti.indexOf(contatto));
    }

    public void cercaContatto(Contatto contatto) {

        System.out.println(listaContatti.indexOf(contatto.toString()));
    }

    @Override
    public String toString() {

        return "Elenco telefonico: " + "\n"
        + listaContatti;
    }
 }
