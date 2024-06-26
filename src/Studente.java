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

    voti.add(voto);
    }

    public double calcolaMediaVoti() {

        double mediaVoti = 0;
        for (int x : voti) {

            mediaVoti += x;
        }

        return mediaVoti /= voti.size();
    }

    @Override
    public String toString() {

        return "Studente " + getNome()
        + " " + getMatricola()
        + " Voti: " + getVoti()
        + " Media voti: " + calcolaMediaVoti();
    }
}
