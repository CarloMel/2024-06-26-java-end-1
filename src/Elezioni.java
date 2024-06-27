import java.util.HashMap;
import java.util.Map;

public class Elezioni {

     private Map<Elettore,Candidato> elezioni;

    public Elezioni () {

        elezioni = new HashMap<>();
    }

    public Map<Elettore, Candidato> getElezioni() {
        return elezioni;
    }

    public void setElezioni(Map<Elettore, Candidato> elezioni) {
        this.elezioni = elezioni;
    }

    public void vota(Elettore e, Candidato c) throws Exception {

        if (getElezioni().containsKey(e)) {
            throw new Exception(
            e.getName()
            + " " 
            + e.getLastName()
            + " "
            + "ha già votato!");
        }

        getElezioni().put(e, c);
    }

    public Map<Candidato,Integer> getValue() {

        Map<Candidato,Integer> mapToReturn = new HashMap<>();

        for (Elettore i : getElezioni().keySet()) {

            Candidato c = getElezioni().get(i);

            // Se c'è già il candidato nella variabile  interna, recupero il valore dei voti e aggiungo +1,
            // altrimenti parto da 1 (perché nessuno lo ha votato)
            if (mapToReturn.containsKey(c)) {

                mapToReturn.put(c,mapToReturn.get(c) + 1);
            } else {

                mapToReturn.put(c,1);
            }
        }

        return mapToReturn;
    }

    public Candidato getWinner() {

        int maxValue = Integer.MIN_VALUE;
        Candidato winner = null;
        Map<Candidato,Integer> map = getValue();

        for (Candidato c : map.keySet()) {

            if (map.get(c) > maxValue) {

                maxValue = map.get(c);
                winner = c;
            }
        }

        return winner;
    }

    @Override
    public String toString() {

        Map<Candidato,Integer> mapToReturnToString = getValue();
        String toStringToReturn = "";

        for (Candidato c : mapToReturnToString.keySet()){
            toStringToReturn += c.getName() + " " + c.getLastName() + " voti: " + mapToReturnToString.get(c) + "\n";
        }

        toStringToReturn += 
        "\n" + "Il vincitore è " 
        + getWinner().getName() 
        + " " 
        + getWinner().getLastName() 
        + "!";

        return toStringToReturn;
        
    }
    
}
