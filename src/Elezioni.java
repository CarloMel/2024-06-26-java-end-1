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

    Map<String,Integer> elezioni = new HashMap<>();
    Map<String,String> votiEffettuati = new HashMap<>();
    Set<String> elettoriCheHannoVotato = new HashSet<>();

    public void inserisciVoto(Elettore elettore, Candidato candidato) {

        String nomeElettore = elettore.getName();
        String nomeCandidato = candidato.getName();

        try {

            if (elettoriCheHannoVotato.contains(nomeElettore)) {

                throw new Exception( nomeCandidato + " è stato già votato");
            }

            votiEffettuati.put(elettore.getName(),candidato.getName());
            elezioni.put(candidato.getName(), 1);
            elettoriCheHannoVotato.add(elettore.getName());
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {

        return "Riassunto elezioni: "
        + elezioni;
    }
    
}
