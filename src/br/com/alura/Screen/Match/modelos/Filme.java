package br.com.alura.Screen.Match.modelos;

import br.com.alura.Screen.Match.modelos.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String movieDirector;
    public Filme(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }

    public String getDiretor() {
        return movieDirector;
    }

    public void setDiretor(String diretor) {
        this.movieDirector = movieDirector;
    }
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}