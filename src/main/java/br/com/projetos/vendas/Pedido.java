package br.com.projetos.vendas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private StatusPedido statusPedido;
    private Cliente cliente;
    private List<ItemPedido> itemPedidos;

    public Pedido(Date momento, StatusPedido statusPedido, Cliente cliente) {
        this.momento = momento;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
        itemPedidos = new ArrayList<>();
    }

    public Pedido() {
        itemPedidos = new ArrayList<>();
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public void addItem(ItemPedido itemPedido){
        itemPedidos.add(itemPedido);
    }

    public void removeItem(ItemPedido itemPedido){
        itemPedidos.remove(itemPedido);
    }

    public Double retornaTotal(){
        Double sum = 0d;
        for (ItemPedido itemPedido : itemPedidos) {
            sum += itemPedido.calculaTotal();
        }
        return sum;
    }

    private Double retornaTotalPedido(){
        Double totalPedido = 0d;
        for (ItemPedido item : itemPedidos) {
            totalPedido += item.calculaTotal();
        }
        return totalPedido;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RESUMO DO PEDIDO: \n");
        stringBuilder.append("Hora de criação: " + sdf1.format(momento) + "\n");
        stringBuilder.append("Status do pedido: " + statusPedido + "\n");
        stringBuilder.append("Cliente: " + cliente.getNome() + " (" + sdf.format(cliente.getAniversario()) + ") - "+ cliente.getEmail() + "\n");
        stringBuilder.append("Items do pedido: \n");
        for (ItemPedido item: itemPedidos) {
            stringBuilder.append(item.getProduto().getNome()
                    + " R$ " + item.getPreco()
                    +  ", Quantidade: "
                    + item.getQuantidade()
                    + ", Subtotal: "
                    + String.format("%.2f", item.calculaTotal()) + "\n");
        }
        stringBuilder.append("Total do pedido: " + String.format("%.2f", retornaTotalPedido()));
        return stringBuilder.toString();
    }


}
