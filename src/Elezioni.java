// * ES5: Sistema di Votazione
// * 
// * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
// * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
// * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
// * doppi voti o voti a candidati non esistenti.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Elezioni {

    // global variables
    Map<String, Integer> candidatiValoriMap = new HashMap<>();
    Map<String, String> votiEffettuati = new HashMap<>();
    Set<String> elettoriCheHannoVotato = new HashSet<>();

    public void inserisciVoto(Elettore elettore, Candidato candidato) {

        // variables to make the code easier to read
        String nomeElettore = elettore.getName();
        String nomeCandidato = candidato.getName();

        // try catch to avoid that one person votes for two candidates
        try {

            if (elettoriCheHannoVotato.contains(nomeElettore)) {

                throw new Exception("Errore: un elettore può votare soltanto un candidato!");
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        // adding values to voti effettuati (elettore1 = Mario)
        votiEffettuati.put(elettore.getName(), candidato.getName());

        // adding values to elettoriCheHannoVotato (elettore1,elettore2 etc)
        elettoriCheHannoVotato.add(elettore.getName());

        // Verifica se il candidato è già presente nella mappa dei voti
        // Se presente, incrementa il conteggio dei voti per il candidato
        // Se non presente, aggiungi il candidato alla mappa con un voto iniziale di 1
        if (candidatiValoriMap.containsKey(nomeCandidato)) {

            int votiAttuali = candidatiValoriMap.get(nomeCandidato);

            candidatiValoriMap.put(nomeCandidato, votiAttuali + 1);
        } else {

            candidatiValoriMap.put(nomeCandidato, 1);
        }
    }

    @Override
    public String toString() {

        return "Riassunto elezioni: "
                + candidatiValoriMap;
    }

}
