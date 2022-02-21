package br.com.projetos.banco.model.exception;

public class SaldoInsuficienteException extends Exception{

    private static final String LIMITE_CREDITO_EXCEDIDO = "Saldo insuficiente para saque !!";

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }

    public SaldoInsuficienteException(){
        super(LIMITE_CREDITO_EXCEDIDO);
    }

}
