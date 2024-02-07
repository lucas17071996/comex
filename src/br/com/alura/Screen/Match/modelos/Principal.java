package br.com.alura.Screen.Match.modelos;

import br.com.alura.Screen.Match.modelos.Calculos.FiltroRecomendacao;
import br.com.alura.Screen.Match.modelos.Filme;
import br.com.alura.Screen.Match.modelos.Serie;
import br.com.alura.Screen.Match.modelos.Calculos.CalculadoraDeTempo;
public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.setNome("Poderoso chefão");
        meufilme.setDuracaoEmMinutos(180);
        meufilme.setAnoDeLancamento(1970);
        System.out.println("Duração do filme" +meufilme.getDuracaoEmMinutos());
        meufilme.exibeFichaTecnica();
        meufilme.avalia(8);
        meufilme.avalia(5);
        meufilme.avalia(10);
        System.out.println("Total de avaliações" +meufilme.getTotalDeAvaliacoes());
        System.out.println(meufilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratona Lost"+meufilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meufilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meufilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualisacoes(300);
        filtro.filtra(episodio);
    }
}