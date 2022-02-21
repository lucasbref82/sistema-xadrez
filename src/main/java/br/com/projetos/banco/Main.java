package br.com.projetos.banco;

import br.com.projetos.banco.model.entidades.Conta;
import br.com.projetos.banco.model.exception.LimiteCreditoExcedidoException;
import br.com.projetos.banco.model.exception.SaldoInsuficienteException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com os dados da conta");
        System.out.print("Número da conta: ");
        Integer numeroConta = entrada.nextInt();
        System.out.print("Dono da conta: ");
        entrada.nextLine();
        String donoConta = entrada.nextLine();
        System.out.print("Saldo inicial: ");
        Double saldoInicial = entrada.nextDouble();
        System.out.print("Limite para saque: ");
        Double limiteSaque = entrada.nextDouble();
        Conta conta = new Conta(numeroConta, donoConta, saldoInicial, limiteSaque);
        System.out.print("Entre com o valor para saque: ");
        try {
            conta.saque(entrada.nextDouble());
            System.out.print("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
        } catch (LimiteCreditoExcedidoException e) {
            System.out.println("Erro ao realizar o saque: "+e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao realizar o saque: "+e.getMessage());
        }finally {
            entrada.close();
        }
    }

}

