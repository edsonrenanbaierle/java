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
    protected char[] tabuleiro = new char[9];
    private Integer contador = 0;
    
    public ControleJogoVelha() {
        this.tempoInicio = System.currentTimeMillis();
    }
    
    @Override
    public void iniciaPartida() {
        this.tempoInicio = System.currentTimeMillis();
        contador  = 0;
        for (char c : tabuleiro) {
            c = ' ';
        }
        
    }

    @Override
    public void adicionaMovimento(Character letra, int pos) {
        this.tabuleiro[pos] = letra;
    }


    @Override
    public long getDuracaoPartida() {
        long tempoFim = System.currentTimeMillis();       
        return tempoFim - this.tempoInicio;
    }

    @Override
    public char avaliaPartida() {
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
        
        contador += 1;
        System.out.println(contador);
        if(contador == 9){
            return 'E';
        }
        
        return ' ';
    }
    
}
