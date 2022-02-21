package br.com.projetos.listas;

import br.com.projetos.ultilitarios.Util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empregado> empregadoArrayList = new ArrayList<>();
        System.out.println("Quantos empregados você irá registrar ? ");
        int qtdFunc = scanner.nextInt();
        for(int i = 1; i <= qtdFunc; i++){
            System.out.println("Empregado: "+ i);
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Salario: ");
            Double salario = scanner.nextDouble();
            Empregado empregado = new Empregado();
            empregado.setId(id);
            empregado.setNome(nome);
            empregado.setSalario(salario);
            empregadoArrayList.add(empregado);
        }

        System.out.println("Digite o empregado que deseja ter o salario aumentado: ");
        Integer idEmpregado = scanner.nextInt();
        Empregado primeiroEmpregado = empregadoArrayList.stream().filter(x -> x.getId().equals(idEmpregado)).findFirst().orElse(null);
        if(primeiroEmpregado != null){
            System.out.println("Digite o valor em percentual a ser adicionado: ");
            Double percentual = scanner.nextDouble();
            primeiroEmpregado.aumentoSalarioPorCento(percentual);
        }else{
            System.out.println("Empregado não existe !");
        }

        System.out.println("Lista de empregados: ");

        for (Empregado empregado: empregadoArrayList) {
            System.out.println(empregado.toString());
        }






    }
}
