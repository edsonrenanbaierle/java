/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public abstract class ControleJogo {
    protected long tempoInicio;
    protected char[] tabuleiro;
    
    public abstract void iniciaPartida();
    public abstract void adicionaMovimento(Character letra, int pos);
    public abstract long getDuracaoPartida();
    public abstract char avaliaPartida(); 
}
