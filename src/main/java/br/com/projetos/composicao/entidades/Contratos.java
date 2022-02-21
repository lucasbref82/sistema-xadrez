package br.com.projetos.composicao.entidades;

import java.util.Date;

public class Contratos {
    private Date dataInicio;
    private Double valorPorHora;
    private Integer totalDeHoras;


    public Contratos(Date dataInicio, Double valorPorHora, Integer totalDeHoras) {
        this.dataInicio = dataInicio;
        this.valorPorHora = valorPorHora;
        this.totalDeHoras = totalDeHoras;
    }

    public Contratos() {

    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getTotalDeHoras() {
        return totalDeHoras;
    }

    public void setTotalDeHoras(Integer totalDeHoras) {
        this.totalDeHoras = totalDeHoras;
    }

    public Double calcularValorContrato(){
        return totalDeHoras * valorPorHora;
    }


}
