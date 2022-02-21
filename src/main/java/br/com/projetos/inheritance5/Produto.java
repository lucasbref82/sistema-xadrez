package br.com.projetos.inheritance5;

public class Produto {

    protected String nome;
    protected Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double retornaPreco(){
        return preco;
    }

    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nome);
        stringBuilder.append(" $ " + String.format("%.2f", preco));

        return stringBuilder.toString();
    }
}
