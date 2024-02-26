package Principal;

import Calculos.CalculadoraDeTempo;
import Calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Veloses e furiosos 8", 2017);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie superNatural = new Serie("SuperNatural", 2005);
        superNatural.exibeFichaTecnica();
        superNatural.setTemporadas(10);
        superNatural.setEpisodiosPorTemporada(10);
        superNatural.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + superNatural.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Harry Potter and prizoner of azkaban", 2008);
        outroFilme.setDuracaoEmMinutos(200);

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
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoLucas = new Filme("the grate master 3", 2017);
        filmeDoLucas.setDuracaoEmMinutos(200);
        filmeDoLucas.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLucas);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());
    }
}