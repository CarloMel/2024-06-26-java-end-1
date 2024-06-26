public class App {
    public static void main(String[] args) throws Exception {

        // es1();
        // es2();
    }

    public static void test() {


    }

    public static void es1() {

        Prenotazione prenotazione = new Prenotazione(10);

        System.out.println(prenotazione);

        System.out.println("Aggiungo 1 posto");
        prenotazione.aggiungiPrenotazioni(1);
        System.out.println(prenotazione);
        System.out.println("==========================================================");

        System.out.println("Aggiungo 8 posti. Dovrebbe restare solo 2 liberi");
        prenotazione.aggiungiPrenotazioni(7);
        System.out.println(prenotazione);
        System.out.println("==========================================================");

        System.out.println("Verifica posti");
        prenotazione.verificaPrenotazioni();
        System.out.println("==========================================================");

        System.out.println("Annullo prenotazione al 1° , 3° e 9° posto");
        prenotazione.annullaPrenotazione(0);
        prenotazione.annullaPrenotazione(2);
        prenotazione.annullaPrenotazione(8);  
        System.out.println(prenotazione);
    }
}

/**
 * TODO:
 * 
 * ES0: Creare un repository su GitHub con il seguente nome:
 * 2024-06-26-java-end-1
 * 
 * Caricare tutti gli esercizi in un unico progetto sulla stessa repo
 * 
 * 
 * ES1: Sistema di Prenotazioni
 * 
 * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
 * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
 * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
 * Implementa metodi per prenotare un posto, annullare la prenotazione e
 * verificare se un o piu' posti sono disponibili.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES2: Registro Studenti
 * 
 * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
 * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
 * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
 * per evitare errori nell'inserimento dei voti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES3: Simulatore di Banca
 * 
 * Definisci una classe ContoBancario con metodi per depositare denaro,
 * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
 * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES4: Elenco Telefonico
 * 
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che gestisca una
 * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
 * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
 * telefono non validi.
 * 
 */