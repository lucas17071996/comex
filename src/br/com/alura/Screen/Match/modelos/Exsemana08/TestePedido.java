package br.com.alura.Screen.Match.modelos.Exsemana08;
public class TestePedido {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido(cliente, 200, 10);
        Pedido pedido1 = new Pedido(cliente, 400, 30);
        Pedido pedido2 = new Pedido(cliente, 450, 40);
    }
    public static class Pedido {
        private int id;
        private Cliente cliente;
        private double preco;
        private int quantidade;
        public Pedido(Cliente cliente, double preco, int quantidade) {

        }

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
        private void MaisBarato() {
            this.MaisBarato();
        }
    }
}