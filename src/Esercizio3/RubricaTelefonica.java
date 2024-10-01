package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

    private HashMap<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public void addContatto(String nome, String numeroTelefono) {
        rubrica.put(nome, numeroTelefono);
        System.out.println("Contatto inserito: " + nome + " | " + numeroTelefono);
    }

    public void removeContatto(String nome) {
        if (rubrica.remove(nome) != null) {
            System.out.println("Hai rimosso il contatto di: " + nome);
        } else {
            System.out.println("Contatto non trovato");
        }
    }

    public String cercaPersonaConIlNumero(String numeroTelefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numeroTelefono)) {
                return entry.getKey();
            }
        }
        return "Numero non trovato.";

    }

    public String cercaNumeroConIlNome(String nome) {
        return rubrica.getOrDefault(nome, "Nome contatto non trovato.");
    }


    public void stampaContatti() {
        if (rubrica.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
            }
        }
    }

    }




