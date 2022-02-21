package br.com.projetos.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        metodo1();

        System.out.println("Fim do programa !");
    }

    public static void metodo1() {
        System.out.println("Metodo 1 iniciou");
        metodo();
        System.out.println("Metodo 1 finalizou");
    }
    public static void metodo() {
        System.out.println("Metodo iniciou");
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        try{
            int posicao = scanner.nextInt();
            System.out.println(strings[posicao]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Posição inválida !");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.err.println("Favor informar somente valores inteiros. ");
        }

        scanner.close();

        System.out.println("Metodo finalizou");
    }
}
