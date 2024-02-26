package Principal;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import execao.ErroDeConversaoDeAnoException;
import modelos.Titulo;
import modelos.TituloOmdb;
import com.google.gson.Gson;
import modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> Titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while(!busca.equalsIgnoreCase("sair")) {
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            String endereco = "https://www.omdbapi.com/?i=t" + busca.replace(" ", "+" + "https://www.omdbapi.com/?i=tt3896198&apikey=b82ae0d1");
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                //try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);
               Titulos.add(meuTitulo);
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço da url");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(Titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(Titulos));
        escrita.close();
        System.out.println("o programa finalizou corretamente");
    }
}