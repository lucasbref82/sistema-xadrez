package br.com.projetos.inheritance7;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o número de formas: ");
        int n = scanner.nextInt();
        List<Forma> formaList = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.println("Dados da forma #"+i+" ");
            System.out.print("Retangulo ou Circulo ? (r/c) ");
            char c = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            String cor = scanner.nextLine();
            Cor cor1 = Cor.valueOf(cor);
            if(c == 'c'){
                System.out.print("Valor do raio: ");
                Double raio = scanner.nextDouble();
                formaList.add(new Circulo(cor1, raio));
            }else{
                System.out.print("Largura: ");
                Double largura = scanner.nextDouble();
                System.out.print("Altura: ");
                Double altura = scanner.nextDouble();
                formaList.add(new Retangulo(cor1, largura, altura));
            }
        }
        System.out.println();
        System.out.println("Área das formas: ");
        for (Forma forma: formaList) {
            System.out.printf("%.2f", forma.calculaArea());
        }

        scanner.close();

    }
}
