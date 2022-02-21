package br.com.projetos.enumerados;

import jdk.jshell.Snippet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.setId(125);
        order.setMomento(new Date());
        order.setStatusPedido(StatusPedido.PENDENTE_PAGAMENTO);
        System.out.println(order);

        StatusPedido statusPedido = StatusPedido.PENDENTE_PAGAMENTO;

        // Conversão String para ENUM

        StatusPedido statusPedido1 = StatusPedido.valueOf("PENDENTE_PAGAMENTO");
        System.out.println(statusPedido);
        System.out.println(statusPedido1);
    }
}
