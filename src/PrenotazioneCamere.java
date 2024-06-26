import java.util.HashMap;
import java.util.Map;

public class PrenotazioneCamere {

    private Map<Cliente, Camera> prenotazioni;

    public PrenotazioneCamere() {

        prenotazioni = new HashMap<>();
    }

    public Map<Cliente, Camera> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(Map<Cliente, Camera> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public void prenotaCamera(Cliente cliente, Camera camera) throws Exception {

        checkPrenotazioni(cliente, camera);
        getPrenotazioni().put(cliente, camera);
    }

    public void modificaPrenotazione(Cliente cliente,Camera camera) throws Exception {

        if (getPrenotazioni().containsKey(cliente)) {

            getPrenotazioni().put(cliente, camera);
            System.out.println("Camera cambiata!");
        } else {
            throw new Exception("Il cliente non ha camere prenotate");
        }
    }

    public void cancellaPrenotazione(Cliente cliente,Camera camera) throws Exception {

        if  (getPrenotazioni().values().contains(camera)) {

            System.out.println("Prenotazione in camera " + camera.getNumeroCamera() 
            + " eliminata con successo");
            getPrenotazioni().remove(cliente,camera);
        } else {
            throw new Exception("Questa camera è già libera");
        }
        
    }

    private void checkPrenotazioni(Cliente cliente, Camera camera) throws Exception {

        if (getPrenotazioni().containsValue(camera)) {
            throw new Exception("La camera è già occupata");
        }

        if(getPrenotazioni().containsKey(cliente))  {
            throw new Exception("Il cliente ha già occupato una camera");
        }
    }

    @Override
    public String toString() {

        String stringToReturn = "";

        for (Cliente c : getPrenotazioni().keySet()) {
            stringToReturn
            += c.getName()
            + " "
            + c.getLastName() 
            + " = Camera " 
            + getPrenotazioni().get(c).getNumeroCamera()
            + "\n";
        }

        return stringToReturn;
    }
}
// * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa
// per
// * associare clienti a prenotazioni e una lista di camere disponibili.
// * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
// * assicurandoti di gestire eccezioni come camere non disponibili o
// * cancellazioni tardive.