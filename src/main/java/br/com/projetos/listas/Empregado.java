package br.com.projetos.listas;

import java.math.BigDecimal;
import java.util.Objects;

public class Empregado {

    private Integer id;
    private String nome;
    private Double salario;


    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Empregado(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return Objects.equals(id, empregado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void aumentoSalarioPorCento(double valorPercentual){
        salario += salario * valorPercentual / 100.0;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.nome + ", " + String.format("%.2f", this.salario);
    }
}
