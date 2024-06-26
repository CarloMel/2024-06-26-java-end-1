// * ES2: Registro Studenti
// * 
// * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
// * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
// * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
// * per evitare errori nell'inserimento dei voti.

import java.util.ArrayList;
import java.util.List;

public class Studente {

    private String nome;
    private String matricola;
    private List<Integer> voti = new ArrayList<>();



    public Studente (String nome, String matricola) {
        setNome(nome);
        setMatricola(matricola);
        getVoti();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricola() {
        return matricola;
    }
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    
    public List<Integer> getVoti() {
        return voti;
    }

    public void setVoti(List<Integer> voti) {

        this.voti = voti;
    }

    public void aggiungiVoto(int voto) {

        try {

            if (voto <= 0 || voto > 10) {
                throw new Exception("I voti devono essere compresi tra 1 e 10");
            }

            voti.add(voto);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public double calcolaMediaVoti() {

        try {

            double mediaVoti = 0;
            for (int x : voti) {
    
                mediaVoti += x;
            }
            
            if ( voti.size() == 0) 
                throw new Exception ("Impossibile calcolare la media senza voti o con voti che valgono 0");

            return mediaVoti /= voti.size();
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public String toString() {

        return "Studente " + getNome()
        + " " + getMatricola()
        + " Voti: " + getVoti()
        + " Media voti: " + calcolaMediaVoti();
    }
}
