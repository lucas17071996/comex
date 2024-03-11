package br.com.alura.Screen.Match.modelos.principal;
import br.com.alura.Screen.Match.modelos.Episodio;
import br.com.alura.Screen.Match.modelos.Filme;
import br.com.alura.Screen.Match.modelos.Serie;
import br.com.alura.Screen.Match.modelos.Calculos.FiltroRecomendacao;
import br.com.alura.Screen.Match.modelos.Calculos.CalculadoraDeTempo;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Veloses e Furiosos",2017);
        meuFilme.setDuracaoEmMinutos(216);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie superNatural = new Serie("SuperNatural",2000);
        superNatural.exibeFichaTecnica();
        superNatural.setTemporadas(10);
        superNatural.setEpisodiosPorTemporada(10);
        superNatural.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar SuperNatural: " + superNatural.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("The Lord of the Rings: The Fellowship of the Ring",2001);
        outroFilme.setDuracaoEmMinutos(226);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(superNatural);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(superNatural);
        filtro.filtra(episodio);

        var filmeDoLucas = new Filme("Star wars",1977);
        filmeDoLucas.setDuracaoEmMinutos(200);
        filmeDoLucas.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLucas);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}
