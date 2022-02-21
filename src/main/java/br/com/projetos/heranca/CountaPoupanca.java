package br.com.projetos.heranca;

public class CountaPoupanca extends Conta{

    private Double taxaJuros;

    public CountaPoupanca(Integer number, String titular, Double saldo, Double taxaJuros) {
        super(number, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public CountaPoupanca() {
        super();
    }

    public CountaPoupanca(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(Double valorSaque){
        saldo -=  valorSaque;
    }

}
