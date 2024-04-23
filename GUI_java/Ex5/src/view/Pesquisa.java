/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

/**
 *
 * @author User
 */
public class Pesquisa extends JDialog implements ActionListener{
    private JLabel labelTexto;
    private JComboBox comboBoxPesquisaTextos;
    private JButton buttonCancelar, buttonOk;
    
    //Text Area Do bloco de notas
    private JTextArea showTextLabelBlocoDeNotas;
    
    
    public Pesquisa(JTextArea showTextLabel){
        //super( ,"Localizar");
        this.setTitle("Localizar");
        
        
        //inicializando
        this.showTextLabelBlocoDeNotas = showTextLabel;
        
        labelTexto = new JLabel("Localizar: ");
        labelTexto.setHorizontalAlignment(SwingConstants.LEFT);
        
        comboBoxPesquisaTextos = new JComboBox();
        comboBoxPesquisaTextos.setEditable(true);
        
        buttonCancelar = new JButton("Cancelar");
        buttonCancelar.setPreferredSize(new Dimension(100, 25));
        
        buttonOk = new JButton("Ok");
        buttonOk.setPreferredSize(new Dimension(100, 25));
        //
        
        //add eventos
        buttonCancelar.addActionListener(this);
        buttonOk.addActionListener(this);
        
        
        JPanel flowButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        flowButtons.add(buttonCancelar);
        flowButtons.add(buttonOk);
        
        //geral
        JPanel JPGeral = new JPanel();
        JPGeral.setLayout(new GridLayout(3, 2));
        JPGeral.add(labelTexto);
        JPGeral.add(comboBoxPesquisaTextos);
        JPGeral.add(flowButtons);
        
        this.setContentPane(JPGeral);
        this.setBounds(600, 600, 400, 150);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonOk){
            //basicamente verifica se foi ativado para ser possivel escrever dentro (não era necessario)
            if(comboBoxPesquisaTextos.isEditable()){
                String TextoPesquisado = (String) comboBoxPesquisaTextos.getEditor().getItem();
                
                int começoIndex = showTextLabelBlocoDeNotas.getText().indexOf(TextoPesquisado);
                
                //verifica se tem texto 
                if(começoIndex != -1){
                    //Highlighter permite realce
                    Highlighter high = showTextLabelBlocoDeNotas.getHighlighter();
                    high.removeAllHighlights();
                    HighlightPainter colorGren = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
    
                   
                    try {
                        
                        //po = posição incicial, p1 = até onde, p = cor que ira utilizar
                        high.addHighlight(começoIndex, começoIndex + TextoPesquisado.length(), colorGren);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(Pesquisa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    System.out.println("Mensagem não encontrada!");
                }
                
                if(!econtrarTexto(TextoPesquisado)){
                    comboBoxPesquisaTextos.addItem(TextoPesquisado);
                }
            }
        }
        
        //fecha a janela de pesquisa
        if(e.getSource() == buttonCancelar){
            this.dispose();
        }
    }
    
    
    //Função que percorre os itens do combo box para verificar se o texto digitado se encontra nele já
    public boolean econtrarTexto(String texto){
        for (int i = 0; i < comboBoxPesquisaTextos.getItemCount(); i++) {
            if(texto.equals(comboBoxPesquisaTextos.getItemAt(i))){
                return true;
            }
        }
        
        
        return false;
        
    }
}
