package br.com.alura.Screen.Match.modelos.principal;
import br.com.alura.Screen.Match.modelos.Filme;
import br.com.alura.Screen.Match.modelos.Serie;
import br.com.alura.Screen.Match.modelos.Titulo;
import br.com.alura.Screen.Match.modelos.principal.Principal;
import java.util.ArrayList;
public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Veloses e Furiosos",2017);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("The Lord of the Rings: The Fellowship of the Ring",2001);
        outroFilme.avalia(8);
        var filmeDoLucas = new Filme("Star wars",1977);
        filmeDoLucas.avalia(10);
        Serie superNatural = new Serie("SuperNatural",2000);
        Filme f1 = filmeDoLucas;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLucas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(superNatural);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " +filme.getClassificacao());
                System.out.println("Ano de lançamento: " +filme.getAnoDeLancamento());
            }
        }
    }
}
