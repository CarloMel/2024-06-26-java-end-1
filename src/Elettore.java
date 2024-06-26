// * ES5: Sistema di Votazione
// * 
// * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
// * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
// * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
// * doppi voti o voti a candidati non esistenti.

public class Elettore {

    private Candidato haVotatoPerCandidato;

    public Candidato getHaVotatoPerCandidato() {
        return haVotatoPerCandidato;
    }

    public void setHaVotatoPerCandidato(Candidato haVotatoPerCandidato) {
        this.haVotatoPerCandidato = haVotatoPerCandidato;
    }

    public void vota(Candidato candidato) {

        setHaVotatoPerCandidato(candidato);
    }

    @Override
    public String toString() {
        return "Questo elettore ha votato per: " + haVotatoPerCandidato;
    }

}
