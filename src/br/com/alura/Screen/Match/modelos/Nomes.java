package br.com.alura.Screen.Match.modelos;
import java.util.ArrayList;
public class Nomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("João Vitor");
        nomes.add("Paulo");
        nomes.add("Karol");
        nomes.add("Léo");
        for (String nome: nomes) {
            System.out.println("Lista de nomes:\n " +nomes);
        }
    }
}
