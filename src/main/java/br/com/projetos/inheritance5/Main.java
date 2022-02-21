package br.com.projetos.inheritance5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de produtos: ");
        List<Produto> produtoList = new ArrayList<>();
        Integer n = scanner.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 1; i <= n ; i++){
            System.out.println("Dados do produto: "+i);
            System.out.print("Comum, usado ou importado ? ");
            char decisao = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: ");
            Double preco = scanner.nextDouble();
            if (decisao == 'u') {
                System.out.print("Digite a data de fabricação: ");
                Date date = sdf.parse(scanner.next());
                produtoList.add(new ProdutoUsado(nome, preco, date));
            } else if (decisao == 'i') {
                System.out.print("Taxa customziada: ");
                Double taxaCustomizada = scanner.nextDouble();
                produtoList.add(new ProdutoImportado(nome, preco, taxaCustomizada));
            }else{
                produtoList.add(new Produto(nome, preco));
            }
        }
        System.out.println();
        System.out.println("PREÇO DOS PRODUTOS: ");
        for (Produto produto1:produtoList) {
            System.out.println(produto1);
        }
    }
}

