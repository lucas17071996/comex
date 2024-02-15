package br.com.alura.Screen.Match.modelos.sprint8;
import java.math.BigDecimal;
public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    // mostrar produtos
    public void mostrarProdutos() {
        System.out.println("Nome: " +nome + "\nDescrição: " +descricao + "\nPreço " +preco + "\nQuantidade: " +quantidade);
    }
}