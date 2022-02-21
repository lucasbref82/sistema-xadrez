package br.com.projetos.composicao.entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {

    private List<Contratos> contratos = new ArrayList<>();
    private String nome;
    private LevelFuncionario levelFuncionario;
    private Double salarioBase;
    private Departamento departamento;

    public Funcionario(){

    }

    public Funcionario(String nome, LevelFuncionario levelFuncionario, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.levelFuncionario = levelFuncionario;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LevelFuncionario getLevelFuncionario() {
        return levelFuncionario;
    }

    public void setLevelFuncionario(LevelFuncionario levelFuncionario) {
        this.levelFuncionario = levelFuncionario;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void adicionaContrato(Contratos contrato){
        contratos.add(contrato);
    }

    public void removeContrato(Contratos contrato){
        contratos.remove(contrato);
    }


    public Double calculaTotal(int mes, int ano){

        Double soma = salarioBase;
        Calendar calendar = Calendar.getInstance();
        for(Contratos contrato : contratos){
            calendar.setTime(contrato.getDataInicio());
            int contrato_ano = calendar.get(Calendar.YEAR);
            int contrato_mes = 1 + calendar.get(Calendar.MONTH);
            if(mes == contrato_mes && ano == contrato_ano){
                soma += contrato.calcularValorContrato();
            }
        }
        return soma;
    }




}
