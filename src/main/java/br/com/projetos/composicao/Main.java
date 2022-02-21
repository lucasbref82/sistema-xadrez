package br.com.projetos.composicao;

import br.com.projetos.composicao.entidades.Contratos;
import br.com.projetos.composicao.entidades.Departamento;
import br.com.projetos.composicao.entidades.Funcionario;
import br.com.projetos.composicao.entidades.LevelFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();
        Departamento departamento = new Departamento();
        departamento.setNomeDepartamento(nomeDepartamento);
        System.out.println("Dados do trabalhador");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Level: ");
        String nivel = scanner.nextLine();
        LevelFuncionario levelFuncionario = LevelFuncionario.valueOf(nivel);
        System.out.print("Sálario Base: ");
        Double valorHora = scanner.nextDouble();
        Funcionario funcionario = new Funcionario();
        funcionario.setLevelFuncionario(levelFuncionario);
        funcionario.setNome(nome);
        funcionario.setSalarioBase(valorHora);
        funcionario.setDepartamento(departamento);

        System.out.print("Quantidade de contratos trabalhados: ");
        scanner.nextLine();
        int qtdContratos = scanner.nextInt();
        for(int i = 1; i <= qtdContratos; i++){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Entre com os dados do contrato: " + i);
            System.out.print("Data do contrato: ");
            scanner.nextLine();
            String dataContrato = scanner.nextLine();
            System.out.print("Valor por hora: ");
            Double valorPorHora = scanner.nextDouble();
            System.out.print("Duração: ");
            Integer duracaoContrato = scanner.nextInt();
            Contratos contratos = new Contratos();
            contratos.setDataInicio(dateFormat.parse(dataContrato));
            contratos.setValorPorHora(valorPorHora);
            contratos.setTotalDeHoras(duracaoContrato);
            funcionario.adicionaContrato(contratos);
        }


        scanner.nextLine();
        System.out.print("Entre com o mes para calcular o total a ser pago: (MM/YYYY): ");
        String mesAno = scanner.nextLine();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Departamento: "+ funcionario.getDepartamento().getNomeDepartamento());
        System.out.println("Total de "+mesAno+": "+String.format("%.2f", funcionario.calculaTotal(mes, ano)));
        scanner.close();
    }

}
