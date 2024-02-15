package br.com.alura.Screen.Match.modelos;
public class Titulo {
    private String name;
    private int releaseYear;
    private boolean incluidePlan;
    private double sumofAvaliations;
    private int totalofAvaliations;
    private int duratiioninMinutes;

    public String getNome() {
        return name;
    }

    public int getAnoDeLancamento() {
        return releaseYear;
    }

    public boolean isIncluidoNoPlano() {
        return incluidePlan;
    }

    public int getDuracaoEmMinutos() {
        return duratiioninMinutes;
    }

    public int getTotalDeAvaliacoes() {
        return totalofAvaliations;
    }
    public void setNome(String nome) {
        this.name = name;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.releaseYear = releaseYear;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidePlan = incluidePlan;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duratiioninMinutes = duratiioninMinutes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void avalia(double note){
        sumofAvaliations += note;
        totalofAvaliations++;
    }

    public double pegaMedia(){
        return sumofAvaliations / totalofAvaliations;
    }
}