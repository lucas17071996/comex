package br.com.alura.Screen.Match.modelos.sprint8;
public class ManipulaCliente {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setBairro("Lapa");
        endereco1.setCidade("São Paulo");
        endereco1.setEstado("SP");
        endereco1.setRua("Guaicuruz");
        endereco1.setNumero(30);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Karol");
        cliente1.setCpf("125.486.799-7");
        cliente1.setEmail("karol@gmail.com");
        cliente1.setProfissao("Dev Backend");
        cliente1.setTelefone("(11)3030-5034");
        cliente1.setEndereco(endereco1);
        cliente1.mostraCliente();
        endereco1.mostraEndereco();
    }
}