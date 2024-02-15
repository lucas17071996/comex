package br.com.alura.Screen.Match.modelos.sprint8;
import br.com.alura.Screen.Match.modelos.sprint8.Endereco;
import br.com.alura.Screen.Match.modelos.sprint8.Produto;
import br.com.alura.Screen.Match.modelos.sprint8.Pedido;
import br.com.alura.Screen.Match.modelos.sprint8.ManipulaCliente;
public class Endereco {
public String bairro;
    public String cidade;
    public String estado;
    public String rua;
    public String complemento;
    public int numero;
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mostraEndereco() {
        System.out.println("Bairro: " +bairro + "\n" + "\nCidade: " +cidade + "\nComplemento: " +complemento +
                "\nEstado: " +estado + "\nRua: " +rua + "Número: " +numero);
    }
}