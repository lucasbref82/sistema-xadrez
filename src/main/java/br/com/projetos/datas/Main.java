package br.com.projetos.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date dataAtual = new Date();
        Date dataAtual2 = new Date(System.currentTimeMillis());
        Date dataAtual3 = new Date(Long.parseLong("2162121"));


        System.out.println(dateFormat.format(dataAtual));
        System.out.println(dateFormat2.format(dataAtual2));
        System.out.println(dateFormat2.format(dataAtual3));
    }
}
