package br.com.projetos.propriasexecoes;

import br.com.projetos.propriasexecoes.model.exceptions.DataInformadaMenorQueAtualException;
import br.com.projetos.propriasexecoes.model.exceptions.DataSaidaMenorEntradaException;
import br.com.projetos.propriasexecoes.model.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Número do quarto: ");
            Integer numeroQuarto = sc.nextInt();
            System.out.print("Data de Check-in: (dd/MM/yyyy): ");
            Date dateCheckIn = dateFormat.parse(sc.next());
            System.out.print("Data de Check-out: (dd/MM/yyyy): ");
            Date dateCheckOut = dateFormat.parse(sc.next());
            Reserva reserva = new Reserva(numeroQuarto, dateCheckIn, dateCheckOut);
            System.out.println(reserva);
            System.out.println("Digite as datas para atualizar a reserva: ");
            System.out.print("Nova data de check-in: ");
            Date dataAtualizadaCheckIn = dateFormat.parse(sc.next());
            System.out.print("Nova data de check-out: ");
            Date dataAtualizadaCheckOut = dateFormat.parse(sc.next());
            reserva.atualizaDatas(dataAtualizadaCheckIn, dataAtualizadaCheckOut);
        }catch (ParseException e){
            System.out.println("Forma de data inválida: " + e.getMessage());
        }catch (DataSaidaMenorEntradaException e){
            System.out.println("Erro na reserva: "+e.getMessage());
        }catch (DataInformadaMenorQueAtualException e){
            System.out.println("Erro na atualização da reserva: "+e.getMessage());
        }finally {
            sc.close();
        }

    }

}

