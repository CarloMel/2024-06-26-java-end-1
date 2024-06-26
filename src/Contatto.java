// * ES4: Elenco Telefonico
// * 
// * Implementa una classe Contatto che rappresenti un contatto telefonico con
// * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che gestisca una
// * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
// * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
// * telefono non validi.

public class Contatto {
    
    private String nome;
    private String numeroTelefono;

    public Contatto(String nome,String numeroTelefono) {


        try {

            char[] charArr = numeroTelefono.toCharArray();
            for (char c : charArr) {

                if (Character.isAlphabetic(c)) {

                    throw new Exception("Numero di telefono non valido, non posso creare un contatto per " + nome);
                }
            }
            setNome(nome);
            setNumeroTelefono(numeroTelefono);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) throws Exception {
        
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {

        return "Nome: " + getNome()
        + " Numero: " + getNumeroTelefono();
    }
}
