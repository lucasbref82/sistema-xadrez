package br.com.projetos.banco.model.entidades;

import br.com.projetos.banco.model.exception.LimiteCreditoExcedidoException;
import br.com.projetos.banco.model.exception.SaldoInsuficienteException;

public class Conta {
    private Integer numero;
    private String dono;
    private Double saldo;
    private Double limiteSaque;

    public Conta(){

    }

    public Conta(Integer numero, String dono, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(Double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void saque(Double valorSaque) throws LimiteCreditoExcedidoException, SaldoInsuficienteException {
        if(valorSaque > limiteSaque){
            throw new LimiteCreditoExcedidoException("O valor excede o limite de saque.");
        }else if(valorSaque > saldo){
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valorSaque;
    }
}
