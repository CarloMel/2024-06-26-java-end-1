// * ES5: Sistema di Votazione
// * 
// * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
// * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
// * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
// * doppi voti o voti a candidati non esistenti.

public class Elettore {

    private Candidato votanteDi;

    public Candidato getVotanteDi() {
        return votanteDi;
    }

    public void setVotanteDi(Candidato votanteDi) {
        this.votanteDi = votanteDi;
    }

    public void vota(Candidato candidato) {

        setVotanteDi(candidato);
    }

    @Override
    public String toString() {
        return "Questo elettore ha votato: " + votanteDi;
    }

}
