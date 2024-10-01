package Esercizio3;

public class Main3 {
    public static void main(String[] args) {
RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.addContatto("Mario Rossi", "123456789");
        rubrica.addContatto("Giuseppe Verdi", "111222333");

        System.out.println("\nStampa contatti:");
        rubrica.stampaContatti();

        System.out.println("\nRicerca numero di Mario Rossi:");
        System.out.println(rubrica.cercaNumeroConIlNome("Mario Rossi"));

        System.out.println("\nRicerca persona con il numero 123456789:");
        System.out.println(rubrica.cercaPersonaConIlNumero("123456789"));

        System.out.println("\nCancellazione contatto Giuseppe Verdi:");
        rubrica.removeContatto("Giuseppe Verdi");

        System.out.println("\nStampa dei contatti dopo la cancellazione:");
        rubrica.stampaContatti();
    }
}
