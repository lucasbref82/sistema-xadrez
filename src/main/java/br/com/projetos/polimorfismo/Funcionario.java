package br.com.projetos.polimorfismo;

public class Funcionario {

    protected String nome;
    private Integer horasTrabalhadas;
    private Double valorPorHora;

    public Funcionario(String nome, Integer horasTrabalhadas, Double valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double pagamento(){
        return horasTrabalhadas * valorPorHora;
    }


    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nome);
        stringBuilder.append(" - ");
        stringBuilder.append("$ " + String.format("%.2f", this.pagamento()));

        return  stringBuilder.toString();
    }


}
