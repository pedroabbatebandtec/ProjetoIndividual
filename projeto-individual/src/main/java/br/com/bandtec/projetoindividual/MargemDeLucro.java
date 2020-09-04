package br.com.bandtec.projetoindividual;

public abstract class MargemDeLucro {
    protected Double valorCompra;
    protected Double porcentagemVenda;

    public MargemDeLucro(Double valorCompra, Double porcentagemVenda) {
        this.valorCompra = valorCompra;
        this.porcentagemVenda = porcentagemVenda;
    }

    public abstract Double valorVenda();

    @Override
    public String toString() {
        return "MargemDeLucro{" +
                "valorCompra=" + valorCompra +
                ", porcentagemVenda=" + porcentagemVenda +
                '}';
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public Double getPorcentagemVenda() {
        return porcentagemVenda;
    }
}
