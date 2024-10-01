package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("**********esercizio1**************");

        Scanner sc = new Scanner(System.in);

        System.out.println("inserisci il numero di elementi da inserire: ");
        int N = sc.nextInt();
        sc.nextLine();

        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleDistinte = new HashSet<>();
        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci una parola :");
            String parola = sc.nextLine();
            if (paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }

        }
        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Parole distinte: " + paroleDistinte);


    }



}
