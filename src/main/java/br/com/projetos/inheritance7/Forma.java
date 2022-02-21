package br.com.projetos.inheritance7;

public abstract class Forma {

    protected Cor cor;

    public Forma() {
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract  Double calculaArea();

}
