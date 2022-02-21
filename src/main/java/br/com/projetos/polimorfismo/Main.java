package br.com.projetos.polimorfismo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o número de funcionários: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        for(int i = 1 ; i <= n; i++){
            System.out.println("Funcionário "+ i +"#");
            System.out.print("Terceirizado (Sim/Nao) ?");
            String decisao = scanner.nextLine();
            Funcionario funcionario;
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Horas trabalhadas: ");
            Integer horasTrabalhadas = scanner.nextInt();
            System.out.print("Valor por hora: ");
            Double valorPorHora = scanner.nextDouble();
            if (decisao.equalsIgnoreCase("Sim")) {
                System.out.print("Valor adicional: ");
                Double valorAdicional = scanner.nextDouble();
                funcionario = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorPorHora, valorAdicional);

            }else{
                funcionario = new Funcionario(nome, horasTrabalhadas, valorPorHora);
            }
            funcionarios.add(funcionario);
            scanner.nextLine();
        }

        System.out.println();

        System.out.println("PAGAMENTOS: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

}
