package br.com.projetos.banco.model.exception;

public class LimiteCreditoExcedidoException extends Exception{

    private static final String LIMITE_CREDITO_EXCEDIDO = "Não foi possivel realizar o saque, limite de crédito foi excedido";

    public LimiteCreditoExcedidoException(String mensagem){
        super(mensagem);
    }

    public LimiteCreditoExcedidoException(){
        super(LIMITE_CREDITO_EXCEDIDO);
    }

}
