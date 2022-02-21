package br.com.projetos.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date date = new Date();

        // Retornando uma instância de Calendar
        Calendar calendar = Calendar.getInstance();

        // Adicionando 4 dias na data criada.
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 4);
        date = calendar.getTime();

        // Recuperando dia e mês do ano individualmente
        int diaMes = calendar.get(Calendar.DAY_OF_MONTH);
        int mesAno = calendar.get(Calendar.MONTH);

        System.out.println(dateFormat.format(date));
        System.out.println(diaMes);
        System.out.println(mesAno);
    }
}
