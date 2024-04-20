/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class PessoaFisica extends Pessoa{
    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(Double gastosComSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double valorImpostoAnual() {
        Double valorDoImposto;
        if(super.getRendaAnual() < 20000){
            valorDoImposto =  super.getRendaAnual() * 0.15;
        }else{
            valorDoImposto =  super.getRendaAnual() * 0.25;
        }
        
        if(this.gastosComSaude > 0){
            valorDoImposto -= gastosComSaude/2;
        }
        
        return valorDoImposto;
    } 
    
}
