package br.com.projetos.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o mes para calcular o total a ser pago: (MM/YYYY): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
        String mesAno = sc.nextLine();
        Date date = dateFormat.parse(mesAno);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int mes = 1 + calendar.get(Calendar.MONTH);
        int ano = calendar.get(Calendar.YEAR);
        System.out.println(mes);
        System.out.println(ano);
    }
}
