/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public abstract class Pessoa {
    private String nome;
    private Double rendaAnual;

    public Pessoa() {
    }

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(" $ ").append(String.format("%.2f", valorImpostoAnual()));
        return sb.toString();
    }
    
    
    public abstract Double valorImpostoAnual();
}
