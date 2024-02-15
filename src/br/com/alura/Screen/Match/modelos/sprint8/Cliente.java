package br.com.alura.Screen.Match.modelos.sprint8;
import br.com.alura.Screen.Match.modelos.sprint8.Endereco;
import br.com.alura.Screen.Match.modelos.sprint8.Produto;
import br.com.alura.Screen.Match.modelos.sprint8.Pedido;
import br.com.alura.Screen.Match.modelos.sprint8.ManipulaCliente;
public class Cliente extends Endereco{
    public String nome;
    public String cpf;
    public String email;
    public String profissao;
    public String telefone;
    public Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome=" + nome + '\'' +
                ", cpf=" + cpf + '\'' +
                ", email=" + email + '\'' +
                ", profissao=" + profissao + '\'' +
                ", telefone=" + telefone + '\'' +
                ", endereco=" + endereco +
                '}';
    }
    public void mostraCliente() {
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nEmail: " + email + "\nProfissão: " + profissao
                + "\nTelefone: " + telefone + "\nEndereco: " + endereco + "\n");
    }
}