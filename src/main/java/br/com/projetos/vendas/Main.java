package br.com.projetos.vendas;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Data de aniversário (DD/MM/AAAA: ");
        String dataAniversario = scanner.nextLine();
        Date data = dateFormat.parse(dataAniversario);
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setAniversario(data);
        cliente.setEmail(email);
        System.out.println("Digite os dados do pedido: ");
        System.out.print("Status: ");
        String statusPedido = scanner.nextLine();
        StatusPedido  statusPedido1 = StatusPedido.valueOf(statusPedido);
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setStatusPedido(statusPedido1);
        pedido.setMomento(new Date());
        System.out.print("Quantos items serão adicionador no pedido ? ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Produto: "+ i);
            System.out.print("Nome do produto: ");
            scanner.nextLine();
            String nomeProd = scanner.nextLine();
            Produto produto = new Produto();
            produto.setNome(nomeProd);
            System.out.print("Preco do produto: ");
            Double precoProduto = scanner.nextDouble();
            produto.setPreco(precoProduto);
            System.out.print("Quantidade do produto: ");
            scanner.nextLine();
            Integer quantidadeProd = scanner.nextInt();
            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setProduto(produto);
            itemPedido.setPreco(precoProduto);
            itemPedido.setQuantidade(quantidadeProd);
            pedido.addItem(itemPedido);
        }

        System.out.println(pedido);

    }
}
