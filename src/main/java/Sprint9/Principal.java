package Sprint9;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite um número de Cep para a consulta");
        var cep = leitura.nextLine();
        try {
            Endereco novoEndreco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndreco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJason(novoEndreco);
        } catch(RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
