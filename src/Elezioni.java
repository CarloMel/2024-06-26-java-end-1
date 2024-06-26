// * ES5: Sistema di Votazione
// * 
// * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
// * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
// * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
// * doppi voti o voti a candidati non esistenti.

import java.util.HashMap;
import java.util.Map;

public class Elezioni {

    Map<String,Integer> elezioni = new HashMap<>();
    Map<Elettore,String> votiEffettuati = new HashMap<>();

    public void inserisciVoto(Elettore elettore, Candidato candidato) {

        votiEffettuati.put(elettore,candidato.getName());
        elezioni.put(candidato.getName(), 1);
    }

    @Override
    public String toString() {

        return "Riassunto elezioni: "
        + elezioni;
    }
    
}
