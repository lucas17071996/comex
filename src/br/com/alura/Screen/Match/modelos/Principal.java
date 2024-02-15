package br.com.alura.Screen.Match.modelos;
import br.com.alura.Screen.Match.modelos.Calculos.CalculadoraDeTempo;
import br.com.alura.Screen.Match.modelos.Calculos.FiltroRecomendacao;
import br.com.alura.Screen.Match.modelos.Episodio;
import br.com.alura.Screen.Match.modelos.Filme;
import br.com.alura.Screen.Match.modelos.Serie;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        Filme mymovie = new Filme();
        mymovie.setNome("Veloses e furiosos 8 ");
        mymovie.setAnoDeLancamento(2017);
        mymovie.setDuracaoEmMinutos(216);
        System.out.println("Duração do filme " +mymovie.getDuracaoEmMinutos());
        mymovie.exibeFichaTecnica();
        mymovie.avalia(8);
        mymovie.avalia(5);
        mymovie.avalia(10);
        System.out.println("Total de avaliações " +mymovie.getTotalDeAvaliacoes());
        System.out.println(mymovie.pegaMedia());
        Serie supernatural = new Serie();
        supernatural.setNome("Super Natural ");
        supernatural.setAnoDeLancamento(2005);
        supernatural.exibeFichaTecnica();
        supernatural.setTemporadas(15);
        supernatural.setEpisodiosPorTemporada(22);
        supernatural.setMinutosPorEpisodio(42);
        System.out.println("Duração para maratonar SuperNatural: " +supernatural.getDuracaoEmMinutos());

        Filme anothermovie = new Filme();
        anothermovie.setNome("Lord of the Rings - The Fellowship of the Ring ");
        anothermovie.setAnoDeLancamento(2001);
        anothermovie.setDuracaoEmMinutos(178);
        anothermovie.avalia(10);
        anothermovie.getTotalDeAvaliacoes();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(mymovie);
        calculadora.inclui(anothermovie);
        calculadora.inclui(supernatural);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filter = new FiltroRecomendacao();
        filter.filtra(mymovie);

        Episodio episode = new Episodio();
        episode.setNumero(1);
        episode.setSerie(supernatural);
        episode.setTotalVisualisacoes(1772727);
        filter.filtra(episode);

        var filmedoLucas = new Filme();
        filmedoLucas.setNome("Harry Potter e as relíqueas da morte");
        filmedoLucas.setAnoDeLancamento(2010);
        filmedoLucas.setDuracaoEmMinutos(226);
        filmedoLucas.avalia(8);

        ArrayList<Filme> listadeFilmes = new ArrayList<>();
        listadeFilmes.add(filmedoLucas);
        listadeFilmes.add(mymovie);
        listadeFilmes.add(anothermovie);
        System.out.println("Tamanho da lista " +listadeFilmes.size());
        System.out.println("Primeiro filme " +listadeFilmes.get(0).getNome());
        System.out.println(listadeFilmes);
    }
}