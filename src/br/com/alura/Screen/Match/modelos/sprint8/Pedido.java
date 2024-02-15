package br.com.alura.Screen.Match.modelos.sprint8;
import java.math.BigDecimal;
public class Pedido {
    private int id;
    private Cliente cliente;
    private double preco;
    private int quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id + ", cliente= " + cliente + ", preco= " + preco + ", quantidade= " + quantidade +
                '}';
    }
    public boolean isMaisBaratoQue(Pedido outroPedido) {
        if (this.preco < outroPedido.getPreco()) {
            return true;
        }
        else {
            return false;
        }

    }
    public boolean isMaisCaroQue(Pedido outroPedido) {
        if (this.preco > outroPedido.getPreco()) {
            return true;
        } else {
            return false;
        }
    }
    public BigDecimal getValor() {
        BigDecimal precoBigDecimal = BigDecimal.valueOf(this.preco);
        BigDecimal quantidadeBigDecimal = BigDecimal.valueOf(this.quantidade);
        return precoBigDecimal.multiply(quantidadeBigDecimal);
    }
}