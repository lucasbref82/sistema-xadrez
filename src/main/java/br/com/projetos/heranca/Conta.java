package br.com.projetos.heranca;

public abstract class Conta {
    private Integer number;
    private String titular;
    protected Double saldo;


    public Conta(Integer number, String titular, Double saldo) {
        this.number = number;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta() {

    }


    public Double getSaldo(){
        return saldo;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(Double valorDeposito){
        saldo += valorDeposito;
    }

    public void sacar(Double valorSaque){
        saldo -= valorSaque + 5.0;
    }
}
