package br.com.alura.Screen.Match.modelos.sprint8;
import br.com.alura.Screen.Match.modelos.sprint8.Endereco;
import br.com.alura.Screen.Match.modelos.sprint8.Produto;
import br.com.alura.Screen.Match.modelos.sprint8.Pedido;
import br.com.alura.Screen.Match.modelos.sprint8.ManipulaCliente;
public class ManipulaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Faca de cozinha ");
        produto1.setDescricao("Utilizada para o preparo dos alimentos ");
        produto1.setPreco(49.50);
        produto1.setQuantidade(20);

        Produto produto2 = new Produto();
        produto2.setNome("Monster ");
        produto2.setDescricao("Bebida Energética ");
        produto2.setPreco(7.99);
        produto2.setQuantidade(80);

        if (produto1.equals(produto2)) {
            System.out.println("Os produtos são iguais \n ");
        }
        else {
            System.out.println("Os produtos não são iguais ");
        }
        produto1.mostrarProdutos();
        produto2.mostrarProdutos();
    }
}
