package br.com.projetos.heranca;

public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;


    public ContaEmpresarial(Integer number, String titular, Double saldo, Double limiteEmprestimo) {
        super(number, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public ContaEmpresarial(){
        super();
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor){
        if(valor <= limiteEmprestimo){
            saldo += valor;
        }

    }
}
