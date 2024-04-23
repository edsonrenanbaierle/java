/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class ControleJogoVelha extends ControleJogo{
    private Integer contador;
    
    public ControleJogoVelha() {
        super.tempoInicio = System.currentTimeMillis();
        super.tabuleiro = new char[9];
        contador = 0;
    }
    
    @Override
    public void iniciaPartida() {
       super.tempoInicio = System.currentTimeMillis();
       super.tabuleiro = new char[9];
       this.contador = 0;
    }

    @Override
    public void adicionaMovimento(Character letra, int pos) {
        super.tabuleiro[pos] = letra;
    }

    @Override
    public long getDuracaoPartida() {
        long newTime = System.currentTimeMillis() - super.tempoInicio;
        
        return newTime;
    }

    @Override
    public char avaliaPartida() {
        if(tabuleiro[0] == 'X' && tabuleiro[1] == 'X' && tabuleiro[2] == 'X'){
            return 'X';
        }else if(tabuleiro[3] == 'X' && tabuleiro[4] == 'X' && tabuleiro[5] == 'X'){
            return 'X';
        }else if(tabuleiro[6] == 'X' && tabuleiro[7] == 'X' && tabuleiro[8] == 'X'){
            return 'X';
        }else if(tabuleiro[0] == 'X' && tabuleiro[3] == 'X' && tabuleiro[6] == 'X'){
            return 'X';
        }else if(tabuleiro[1] == 'X' && tabuleiro[4] == 'X' && tabuleiro[7] == 'X'){
            return 'X';
        }else if(tabuleiro[2] == 'X' && tabuleiro[5] == 'X' && tabuleiro[8] == 'X'){
            return 'X';
        }else if(tabuleiro[0] == 'X' && tabuleiro[4] == 'X' && tabuleiro[8] == 'X'){
            return 'X';
        }else if(tabuleiro[2] == 'X' && tabuleiro[4] == 'X' && tabuleiro[6] == 'X'){
            return 'X';
        }
        
        if(tabuleiro[0] == 'O' && tabuleiro[1] == 'O' && tabuleiro[2] == 'O'){
            return 'O';
        }else if(tabuleiro[3] == 'O' && tabuleiro[4] == 'O' && tabuleiro[5] == 'O'){
            return 'O';
        }else if(tabuleiro[6] == 'O' && tabuleiro[7] == 'O' && tabuleiro[8] == 'O'){
            return 'O';
        }else if(tabuleiro[0] == 'O' && tabuleiro[3] == 'O' && tabuleiro[6] == 'O'){
            return 'O';
        }else if(tabuleiro[1] == 'O' && tabuleiro[4] == 'O' && tabuleiro[7] == 'O'){
            return 'O';
        }else if(tabuleiro[2] == 'O' && tabuleiro[5] == 'O' && tabuleiro[8] == 'O'){
            return 'O';
        }else if(tabuleiro[0] == 'O' && tabuleiro[4] == 'O' && tabuleiro[8] == 'O'){
            return 'O';
        }else if(tabuleiro[2] == 'O' && tabuleiro[4] == 'O' && tabuleiro[6] == 'O'){
            return 'O';
        }
        
        this.contador += 1;
        if(this.contador == 9){
            return 'E';
        }
        
        return '0';
    }
    
}
