package br.com.projetos.composicao.entidades;

public class Departamento {
    private String nomeDepartamento;


    public Departamento(){

    }

    public Departamento(String nomeDepartamento){
        this.nomeDepartamento = nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento){
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getNomeDepartamento(){
        return nomeDepartamento;
    }

    public String toString(){
        return nomeDepartamento;
    }


}
