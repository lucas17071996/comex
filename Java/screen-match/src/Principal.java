import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("Veloses e furiosos 8");
        favorito.setAnoDeLancamento(2017);
        favorito.setDuracaoEmMinutos(216);
        favorito.setIncluidoNoPlano(true);
        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("A média das avaliações é:" +favorito.pegaMedia());
    }
}