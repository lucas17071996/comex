package br.com.alura.comex;

public class Exercicios {
    public static void main(String[] args) {
        Produto jogos = new Produto("GTA 5");
        jogos.setNome("GTA 5");
        jogos.setDescricao("""
                Quando um tratante inexperiente, 
                um ladrão de bancos aposentado e um psicopata aterrorizante se envolvem com algumas das figuras mais 
                assustadoras e problemáticas do submundo do crime, do governo dos EUA e da indústria do entretenimento, 
                eles precisam realizar uma série de golpes ousados para sobreviver em uma cidade
                """);
        jogos.setPrecoUnitario(102.99);
        jogos.setPrecoUnitario(100000);
        System.out.println("Nome do Jogo: " + jogos.getNome());
        System.out.println("Descrição do jogo: " + jogos.getDescricao());
        System.out.println("Preço do jogo: " + jogos.getPrecoUnitario());
        System.out.println("quantidade de cópias" + jogos.getQuantidade());

        Produto filme = new Produto("Harry Potter");

        filme.setNome("Harry Potter");
        filme.setDescricao("Harry Potter é uma das maiores franquias do cinema, criada a partir dos livros da autora J.K. Rowling. " +
                "A trama segue um menino órfão que recebe uma carta convidando-o " +
                "para se tornar bruxo em uma das maiores escolas de magia do mundo, Hogwarts.");
        filme.setPrecoUnitario(30.5);
        filme.setQuantidade(20000);
        System.out.println("nome do filme " + filme.getNome());
        System.out.println("descrição do filme " + filme.getDescricao());
        System.out.println("quantidade de ingressos vendidos " +filme.getQuantidade());
        System.out.println("preço do ingresso" +filme.getPrecoUnitario());

        if (jogos.equals(filme)) {
            System.out.println("são iguais");
        }
        else {
            System.out.println("não são iguais");
        }

        System.out.println(jogos.toString());

        Produto livro = new Produto("código limpo");
        livro.setNome("código limpo");
        livro.setPrecoUnitario(100.5);
        System.out.println("nome do livro " + livro.getNome());
        System.out.println("preço do livro " + livro.getPrecoUnitario());

        Endereco casa = new Endereco();
        casa.setBairro("Lapa") ;
        casa.setCidade("São Paulo");
        casa.setEstado("SP");
        casa.setRua("rua scipão");
        System.out.println("Bairro: " +casa.getBairro());
        System.out.println("Cidade" +casa.getCidade());
        System.out.println("Estado: " +casa.getEstado());
        System.out.println("Nome da Rua: " +casa.getRua());

        Cliente pessoa = new Cliente();
        pessoa.nome = "Luiz";
        pessoa.cpf = "44444.4444";
        pessoa.email = "contato@email";
        pessoa.endereco = casa;
        pessoa.profissao = "Dev";
        pessoa.telefone = "9999999999999";
        System.out.println("Nome: " +pessoa.nome);
        System.out.println("cpf: " +pessoa.cpf);
        System.out.println("email: " +pessoa.email);
        System.out.println("Profissao" +pessoa.profissao);
        System.out.println("Telefone" +pessoa.telefone);
    }
}