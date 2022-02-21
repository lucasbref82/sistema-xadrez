package br.com.projetos.inheritance7;

public class Circulo extends Forma{

    private Double raio;

    public Circulo(Cor cor, Double raio){
        super(cor);
        this.raio = raio;
    }

    public Circulo(){
        super();
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


    @Override
    public Double calculaArea() {
        return Math.PI * raio * raio;
    }
}
