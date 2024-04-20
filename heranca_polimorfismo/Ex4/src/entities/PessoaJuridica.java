/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class PessoaJuridica extends Pessoa {

    private Integer numeroDeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(Integer numeroDeFuncionarios, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double valorImpostoAnual() {
        if (this.numeroDeFuncionarios > 10) {
            return super.getRendaAnual() * 0.14;
        } else {
            return super.getRendaAnual() * 0.16;
        }
    }

}
