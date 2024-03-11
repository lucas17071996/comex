package br.com.alura.Screen.Match.modelos;
public class Serie extends Titulo{
    private int seasons;
    private boolean active;
    private int episodesperSeasons;
    private int minutesperEpisode;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return seasons;
    }

    public void setTemporadas(int temporadas) {
        this.seasons = seasons;
    }

    public boolean isAtiva() {
        return active;
    }

    public void setAtiva(boolean ativa) {
        this.active = active;
    }

    public int getEpisodiosPorTemporada() {
        return episodesperSeasons;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodesperSeasons = episodesperSeasons;
    }

    public int getMinutosPorEpisodio() {
        return minutesperEpisode;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutesperEpisode = minutesperEpisode;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return seasons * episodesperSeasons * minutesperEpisode;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}