import java.util.HashMap;

public class PrenotazioneCamere {

    Map<Cliente,Camera> prenotazioni;

    public PrenotazioneCamere() {

        prenotazioni = new HashMap<>();
    }
    
}
// * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
// * associare clienti a prenotazioni e una lista di camere disponibili.
// * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
// * assicurandoti di gestire eccezioni come camere non disponibili o
// * cancellazioni tardive.