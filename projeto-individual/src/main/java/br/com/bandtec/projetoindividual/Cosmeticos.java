package br.com.bandtec.projetoindividual;

public class Cosmeticos extends MargemDeLucro{
    private String nome;
    private Integer codBarra;

    public Cosmeticos(Double valorCompra, Double porcentagemVenda, String nome, Integer codBarra) {
        super(valorCompra, porcentagemVenda);
        this.nome = nome;
        this.codBarra = codBarra;
    }

    @Override
    public Double valorVenda() {
        return valorCompra += valorCompra * porcentagemVenda;
    }

    @Override
    public String toString() {
        return "Cosmeticos{" +
                "nome='" + nome + '\'' +
                ", codBarra=" + codBarra +
                ", Valor venda=" + valorVenda() +
                "} " + super.toString();
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodBarra() {
        return codBarra;
    }
}
