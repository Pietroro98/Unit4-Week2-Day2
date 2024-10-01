package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneraNumeri {

        public static List<Integer> generaNumeriCasuali(int N) {
            List<Integer> numeriCasuali = new ArrayList<>();
            Random rand = new Random();
            for (int i = 0; i < N; i++) {
                numeriCasuali.add(rand.nextInt(101));
            }
            Collections.sort(numeriCasuali);
            return numeriCasuali;
        }

        public static List<Integer> duplicaEInverti(List<Integer> lista) {
            List<Integer> nuovaLista = new ArrayList<>(lista);
            List<Integer> listaInvertita = new ArrayList<>(lista);
            Collections.reverse(listaInvertita);
            nuovaLista.addAll(listaInvertita);
            return nuovaLista;
        }

        public static void stampaPosizioni(List<Integer> lista, boolean posizioniPari) {
            for (int i = 0; i < lista.size(); i++) {
                if (posizioniPari && i % 2 == 0) {
                    System.out.println("Posizione " + i + ": " + lista.get(i));
                } else if (!posizioniPari && i % 2 != 0) {
                    System.out.println("Posizione " + i + ": " + lista.get(i));
                }
            }
        }
    }


