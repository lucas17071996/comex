public class Servico implements Tributavel{

    private String descricao;
    private double valor;
    private double aliquotaIss;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAliquotaIss() {
        return aliquotaIss;
    }

    public void setAliquotaIss(double aliquotaIss) {
        this.aliquotaIss = aliquotaIss;
    }
    @Override
    public double getValorImposto() {
        return 0;
    }
}
