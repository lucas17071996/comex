package br.com.alura.Screen.Match.modelos.sprint8;
import br.com.alura.Screen.Match.modelos.sprint8.Endereco;
import br.com.alura.Screen.Match.modelos.sprint8.Produto;
import br.com.alura.Screen.Match.modelos.sprint8.Pedido;
import br.com.alura.Screen.Match.modelos.sprint8.ManipulaCliente;

import javax.management.PersistentMBean;
import java.util.ArrayList;
import java.util.Comparator;
public class PedidosOrdenados {
    public static void main(String[] args) {
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Gabriela ");
        cliente3.setCpf("\n 126.436.720-3");
        cliente3.setEmail("\n Gabriela@gmail.com");
        cliente3.setProfissao("\n Analísta Sênior");
        cliente3.setTelefone("\n (11)3232-3434");
        cliente3.setEndereco(null);

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        pedido1.setCliente(cliente3);
        pedido1.setPreco(15.50);
        pedido1.setQuantidade(8);

        Pedido pedido2 = new Pedido();
        pedido2.setId(2);
        pedido2.setCliente(cliente3);
        pedido2.setPreco(18.90);
        pedido2.setQuantidade(30);

        Pedido pedido3 = new Pedido();
        pedido3.setId(3);
        pedido3.setCliente(cliente3);
        pedido3.setPreco(20.25);
        pedido3.setQuantidade(60);

        Pedido pedido4 = new Pedido();
        pedido4.setId(4);
        pedido4.setCliente(cliente3);
        pedido4.setPreco(15.99);
        pedido4.setQuantidade(16);

        Pedido pedido5 = new Pedido();
        pedido5.setId(5);
        pedido5.setCliente(cliente3);
        pedido5.setPreco(35.80);
        pedido5.setQuantidade(12);

        ArrayList<Pedido> listaDePedidos = new ArrayList<>();
        listaDePedidos.add(pedido1);
        listaDePedidos.add(pedido2);
        listaDePedidos.add(pedido3);
        listaDePedidos.add(pedido4);
        listaDePedidos.add(pedido5);
        listaDePedidos.sort(Comparator.comparing(Pedido::getValor));
        System.out.println(listaDePedidos);
        listaDePedidos.sort(Comparator.comparing(Pedido::getValor).reversed());
    }
    }