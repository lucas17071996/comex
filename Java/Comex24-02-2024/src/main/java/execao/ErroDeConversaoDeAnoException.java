package execao;
public class ErroDeConversaoDeAnoException extends RuntimeException{
    private String menssagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.menssagem = mensagem;
    }
    public String getMessage() {
        return this.menssagem;
    }
}
