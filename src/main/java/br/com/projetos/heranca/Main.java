package br.com.projetos.heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Conta conta1 = new CountaPoupanca(1002, "Maria", 1000.00, 0.01);
        Conta conta2 = new ContaEmpresarial(1003, "Bob", 1000.00, 500.00);
        List<Conta> contaList = new ArrayList<>();
        contaList.add(conta1);
        contaList.add(conta2);


        for (Conta conta : contaList) {
            conta.depositar(Double.valueOf(100));
            System.out.println(conta.getSaldo());
        }

    }
}
