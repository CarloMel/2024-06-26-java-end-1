import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // es1();
        // es2();
        // es3();
        // es4();
        es5();
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

    public static void es2 () {
        Studente studente = new Studente("Mario","MAT1234");

        studente.aggiungiVoto(1);
        studente.aggiungiVoto(10);
        System.out.println(studente);
    }

    public static void es3() {

        ContoBancario contoBancario = new ContoBancario();

        System.out.println(contoBancario);

        System.out.println("====================================");
        contoBancario.depositaDenaro(200);
        System.out.println(contoBancario);

        System.out.println("====================================");
        contoBancario.prelevaDenaro(150);
        System.out.println(contoBancario);

        System.out.println("====================================");

        System.out.println("Deposito 0");
        contoBancario.depositaDenaro(0);

        System.out.println("Deposito -1");
        contoBancario.depositaDenaro(-1);

        System.out.println("====================================");

        System.out.println("Ritiro 1000");
        contoBancario.prelevaDenaro(1000);
        System.out.println(contoBancario);

        System.out.println("====================================");

        System.out.println("Ritiro 49");
        contoBancario.prelevaDenaro(49);
        System.out.println(contoBancario);
    }

    public static void es4() {

        // 11 contatti in totale
        Contatto Mario = new Contatto("Mario","123456");
        Contatto Luigi = new Contatto("Luigi","789101");
        Contatto Wrong = new Contatto("Wrong","78a9101");
        Contatto Carlo = new Contatto("Carlo","24534");
        Contatto Gianni = new Contatto("Gianni","763456");
        Contatto Pino = new Contatto("Pino","093456");
        Contatto Maria = new Contatto("Maria","126578");
        Contatto Anna = new Contatto("Anna","256345");
        Contatto Holly = new Contatto("Holly","223457");
        Contatto Tina = new Contatto("Tina","009345");
        Contatto Piero = new Contatto("Piero","125467");
        ElencoTelefonico elenco = new ElencoTelefonico();



        System.out.println(Mario);
        System.out.println(elenco);
        System.out.println("====================================");

        System.out.println(Mario);
        System.out.println(Luigi);
        System.out.println();

        System.out.println("Aggiungo solo Mario");
        elenco.aggiungiContatto(Mario);
        System.out.println(elenco);

        System.out.println("Aggiungo Luigi");
        elenco.aggiungiContatto(Luigi);
        System.out.println(elenco);

        System.out.println("====================================");

        System.out.println("Rimuovo Mario");
        elenco.rimuoviContatto(Mario);;
        System.out.println(elenco);

        System.out.println("====================================");

        System.out.println("Controllo se contatto errato è stato creato");
        System.out.println(Wrong);

        System.out.println("====================================");

        System.out.println("Aggiungo 8 contatti così da poter cercare qualcuno");
        elenco.aggiungiContatto(Piero);
        elenco.aggiungiContatto(Carlo);
        elenco.aggiungiContatto(Gianni);
        elenco.aggiungiContatto(Pino);
        elenco.aggiungiContatto(Maria);
        elenco.aggiungiContatto(Holly);
        elenco.aggiungiContatto(Anna);
        elenco.aggiungiContatto(Tina);

        System.out.println(elenco);

        System.out.println("Cerco Carlo");
        elenco.cercaContatto(Carlo);

    }

    public static void es5() {

        Elezioni elezioni = new Elezioni();
        Candidato candidato1 = new Candidato();
        Elettore Mario = new Elettore("Mario");

        System.out.println(elezioni);

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
 *  * POMERIGGIO
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES5: Sistema di Votazione
 * 
 * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
 * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
 * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
 * doppi voti o voti a candidati non esistenti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES6: Sistema di Prenotazione Hotel
 * 
 * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
 * associare clienti a prenotazioni e una lista di camere disponibili.
 * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
 * assicurandoti di gestire eccezioni come camere non disponibili o
 * cancellazioni tardive.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES7: Impiegato e Manager
 * 
 * Crea una classe Impiegato con attributi come nome, salario e metodi per
 * aumentaSalario(int percentuale). Deriva da questa una classe Manager che
 * aggiunge l'attributo bonus. Il metodo aumentaSalario del manager dovrebbe
 * considerare anche il bonus nell'aumento. Mostra come puoi utilizzare il
 * polimorfismo per gestire diversi tipi di impiegati in un array di tipo
 * Impiegato.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES8: Sistema di Prenotazione Alberghiera
 * 
 * Progetta una classe astratta CameraAlbergo con metodi come calcolaCosto() e
 * numeroLetti(). Deriva da questa diverse classi specifiche come CameraSingola,
 * CameraDoppia e Suite. Implementa calcolaCosto in modo diverso per ogni tipo
 * di camera. Utilizza una collezione per gestire tutte le camere disponibili in
 * un albergo.
 * 
 * --------------------------------------------------------------------------- */