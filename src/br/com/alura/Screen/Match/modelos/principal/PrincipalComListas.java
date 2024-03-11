package br.com.alura.Screen.Match.modelos.principal;

import br.com.alura.Screen.Match.modelos.Filme;
import br.com.alura.Screen.Match.modelos.Serie;
import br.com.alura.Screen.Match.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Veloses e Furiosos", 2017);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("The Lord of the Rings: The Fellowship of the Ring", 2001);
        outroFilme.avalia(8);
        Filme filmeDoLucas = new Filme("Star wars", 1977);
        filmeDoLucas.avalia(10);
        Serie superNatural = new Serie("SuperNatural", 2000);
        Filme f1 = filmeDoLucas;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLucas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(superNatural);
        for (Titulo item : lista) {
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println(item.getNome());
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println("Ano de lançamento: " + filme.getAnoDeLancamento());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Emma Whatson");
        buscaPorArtista.add("Will Schmit");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

        Collections.sort(lista);
        for (Titulo titulo: lista) {
            System.out.println(titulo.getNome());
        }
    }
}
