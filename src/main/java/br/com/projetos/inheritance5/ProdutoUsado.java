package br.com.projetos.inheritance5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Date dataDeFabricacao;

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public ProdutoUsado() {
        super();
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public Double retornaPreco(){
        return super.retornaPreco();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nome + " (used)");
        stringBuilder.append(" $ " + super.retornaPreco());
        stringBuilder.append(" (data de fabricação: "+dateFormat.format(dataDeFabricacao)+")");

        return stringBuilder.toString();
    }
}


