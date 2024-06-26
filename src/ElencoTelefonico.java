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

        
        try {

            char[] charArr = contatto.getNumeroTelefono().toCharArray();
            for (char c : charArr) {

                if (Character.isAlphabetic(c)) {
                    throw new Exception("I numeri di telefono non hanno lettere. " 
                    + contatto.getNome() 
                    +  " non è un contatto valido");
                }
            }
            
            listaContatti.add(contatto);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public void rimuoviContatto(Contatto contatto) {

        listaContatti.remove(listaContatti.indexOf(contatto));
    }

    public void cercaContatto(Contatto contatto) {

        int posizioneContatto = listaContatti.indexOf(contatto);

        System.out.println(listaContatti.get(posizioneContatto));
    }

    @Override
    public String toString() {

        return "Elenco telefonico: " + "\n"
        + listaContatti;
    }
 }
