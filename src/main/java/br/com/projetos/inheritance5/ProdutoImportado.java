package br.com.projetos.inheritance5;

public class ProdutoImportado extends Produto{

    private Double taxaAdicional;

    public ProdutoImportado(String nome, Double preco, Double taxaAdicional) {
        super(nome, preco);
        this.taxaAdicional = taxaAdicional;
    }

    public ProdutoImportado() {
        super();
    }

    public Double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public Double retornaPreco(){
        return super.retornaPreco();
    }

    private Double totalPreco(){
        return this.retornaPreco() + taxaAdicional;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nome);
        stringBuilder.append(" $ "+totalPreco());
        stringBuilder.append("(Taxa adicional: $ "+taxaAdicional+")");

        return stringBuilder.toString();
    }

}
