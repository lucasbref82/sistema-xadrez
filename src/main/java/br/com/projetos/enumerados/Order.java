package br.com.projetos.enumerados;

import java.util.Date;

public class Order {

    private Integer id;
    private Date momento;
    private StatusPedido statusPedido;

    public Order(Integer id, Date momento, StatusPedido statusPedido) {
        this.id = id;
        this.momento = momento;
        this.statusPedido = statusPedido;
    }

    public Order(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", momento=" + momento +
                ", statusPedido=" + statusPedido +
                '}';
    }
}
