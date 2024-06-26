// * ES5: Sistema di Votazione
// * 
// * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
// * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
// * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
// * doppi voti o voti a candidati non esistenti.

import java.util.HashMap;
import java.util.Map;

public class GestioneVotazioni {

    private Map<Candidato, Integer> mappaVotazioni = new HashMap<>();

    public Map<Candidato, Integer> getMappaVotazioni() {
        return mappaVotazioni;
    }

    public void setMappaVotazioni(Map<Candidato, Integer> mappaVotazioni) {
        this.mappaVotazioni = mappaVotazioni;
    }

    @Override
    public String toString() {

        return "Riassunto Candidati e valutazioni: " + "\n"
        + mappaVotazioni.toString();
    }
}
