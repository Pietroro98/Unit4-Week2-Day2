package Esercizio2;

import java.util.List;

import static Esercizio2.GeneraNumeri.*;

public class Main2 {
    public static void main(String[] args) {
        int N = 4;
        List<Integer> numeriCasuali = generaNumeriCasuali(N);
        System.out.println("Lista di numeri casuali ordinati: " + numeriCasuali);

        List<Integer> listaDuplicataInvertita = duplicaEInverti(numeriCasuali);
        System.out.println("Lista duplicata e invertita: " + listaDuplicataInvertita);

        System.out.println("Valori in posizioni pari:");
        stampaPosizioni(listaDuplicataInvertita, true);

        System.out.println("Valori in posizioni dispari:");
        stampaPosizioni(listaDuplicataInvertita, false);
    }
}
