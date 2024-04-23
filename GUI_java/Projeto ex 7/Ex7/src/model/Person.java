/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Person {
    private String cpf;
    private String nome;
    private String enderco;
    private String cep;
    private String telefone;

    public Person(String cpf, String nome, String enderco, String cep, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.enderco = enderco;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Person{" + "cpf=" + cpf + ", nome=" + nome + ", enderco=" + enderco + ", cep=" + cep + ", telefone=" + telefone + '}';
    }
    
    
}
