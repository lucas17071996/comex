package br.com.alura.Screen.Match.modelos.sprint8;
import br.com.alura.Screen.Match.modelos.sprint8.Endereco;
import br.com.alura.Screen.Match.modelos.sprint8.Produto;
import br.com.alura.Screen.Match.modelos.sprint8.Pedido;
import br.com.alura.Screen.Match.modelos.sprint8.ManipulaCliente;
public class TestaPedido {
    public static void main(String[] args) {
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Roberto");
        cliente2.setCpf("\n 123.456.789-5");
        cliente2.setEmail("\n roberto@gmail.com");
        cliente2.setProfissao("\n Monitor");
        cliente2.setTelefone("\n(11)4050-8010");
        cliente2.setEndereco(null);

        Produto outroPoduto = new Produto();
        outroPoduto.setNome("Pc-Gamer");
        outroPoduto.setDescricao("Utilizado para jogar, trabalhar, e estudar");
        outroPoduto.setQuantidade(100);
        outroPoduto.setPreco(5000);

        Pedido novoPedido = new Pedido();
        novoPedido.setId(1);
        novoPedido.setCliente(cliente2);
        novoPedido.setPreco(5000);
        novoPedido.setQuantidade(10);
        System.out.println(novoPedido);
    }
}