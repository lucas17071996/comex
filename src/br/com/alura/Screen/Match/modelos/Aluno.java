package br.com.alura.Screen.Match.modelos;
import br.com.alura.Screen.Match.modelos.Pessoa;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    public Aluno(String nome, int idade, int matricula) {
        this.matricula = matricula;
        this.curso = curso;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
}
