package br.com.projetos.propriasexecoes.model;

import br.com.projetos.propriasexecoes.model.exceptions.DataInformadaMenorQueAtualException;
import br.com.projetos.propriasexecoes.model.exceptions.DataSaidaMenorEntradaException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static final String DATA_SAIDA_MENOR_ENTRADA = "Data de saída menor que a de entrada";


    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
        if(checkIn.after(checkOut)){
            throw new DataSaidaMenorEntradaException(DATA_SAIDA_MENOR_ENTRADA);
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Long duracaoDias(){
        Long diferenca = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizaDatas(Date checkIn, Date checkOut){
        Date agora = new Date();
        if(checkIn.before(agora) || (checkOut.before(agora))){
            throw new DataInformadaMenorQueAtualException("Datas tem que ser maiores que a data atual!");
        }else if(checkOut.before(checkIn)){
            throw new DataSaidaMenorEntradaException(DATA_SAIDA_MENOR_ENTRADA);
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reserva: ");
        stringBuilder.append("Quarto: "+numeroQuarto+", ");
        stringBuilder.append("check-in: "+dateFormat.format(checkIn)+", ");
        stringBuilder.append("check-out: "+dateFormat.format(checkOut)+", ");
        stringBuilder.append(duracaoDias() + " noites");
        return stringBuilder.toString();
    }
}
