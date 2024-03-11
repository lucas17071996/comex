package br.com.alura.Screen.Match.modelos.Calculos;
import br.com.alura.Screen.Match.modelos.Filme;
import br.com.alura.Screen.Match.modelos.Titulo;
import br.com.alura.Screen.Match.modelos.Serie;
import br.com.alura.Screen.Match.modelos.Episodio;
public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}