package br.com.projetos.polimorfismo;

public class FuncionarioTerceirizado extends Funcionario{


    private  Double valorAdicional;


    public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorPorHora, Double valorAdicional) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.valorAdicional = valorAdicional;
    }

    public FuncionarioTerceirizado(){
        super();
    }


    @Override
    public Double pagamento() {
        return super.pagamento()  + (valorAdicional *  1.10);
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
