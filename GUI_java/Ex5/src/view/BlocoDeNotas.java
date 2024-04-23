/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;


/**
 *
 * @author User
 */
public class BlocoDeNotas extends JFrame implements KeyListener{
    private JTextField textLabel;
    private JTextArea showTextLabel;
    private JButton insertTextButton;
    private String savedContent = "";
    
    public BlocoDeNotas(String name){
        this.setTitle(name);
       
        //iniciando controlers
        textLabel = new JTextField(10);
        textLabel.addKeyListener(this);
        textLabel.setFocusable(true);

        showTextLabel = new JTextArea();
        showTextLabel.setFocusable(false);

        insertTextButton = new JButton("Inserir: ");
        insertTextButton.addKeyListener(this);

        //evento para adicionar texto
        insertTextButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == insertTextButton){
                addText();
            }
        }   
        });
        
        //evento ao fechar perguntar caso não foi salvo
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                question();
            }     
        });
        
        //panel flow layout  e add
        JPanel JPButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPButtons.add(insertTextButton);
        JPButtons.add(textLabel);
        
        //panel geral
        JPanel JPGeral = new JPanel();
        BoxLayout box = new BoxLayout(JPGeral, BoxLayout.PAGE_AXIS);
        JPGeral.setLayout(box);
        JPGeral.add(showTextLabel);
        JPGeral.add(JPButtons);
        
        this.setContentPane(JPGeral);
        this.setBounds(600, 600, 700, 300);
        
    }
    
    private void openPesquisa(){
        // Lógica para abrir outra janela de pesquisa
        Pesquisa pesquisa = new Pesquisa(showTextLabel);
        pesquisa.setModal(true);//abre um modal em cima de outro
        pesquisa.setVisible(true);
    }
    
    public void addText(){
            //pega o texto do textField
            String texto = textLabel.getText();
            
            //pega o texto do text area
            String textoArea = showTextLabel.getText();
            
            //confere se no primeiro digito está vazio para não usar o \n
            if(showTextLabel.getText().equals("")){
                showTextLabel.setText(texto);
            }else{
                String juncao = textoArea + "\n" + texto;
                showTextLabel.setText(juncao);
            }
  
            textLabel.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            addText();
        } else if (e.getKeyCode() == KeyEvent.VK_S && e.isControlDown()) {
            this.savedContent = saveTxt();
        }else if(e.getKeyCode() == KeyEvent.VK_F && e.isControlDown()){
            openPesquisa();
        }else if(e.getKeyCode() == KeyEvent.VK_O && e.isControlDown()){   
            this.savedContent = openTxt();
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    public String saveTxt(){
        JFileChooser fileChooser = new JFileChooser();
        
        //achou caminho
        int resultado = fileChooser.showSaveDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = fileChooser.getSelectedFile();

            if (!arquivoSelecionado.getAbsolutePath().endsWith(".txt")) {
                arquivoSelecionado = new File(arquivoSelecionado.getAbsolutePath() + ".txt");
            }

            try {
                FileWriter writer = new FileWriter(arquivoSelecionado);
                writer.write(showTextLabel.getText()); // Substitua pelo texto que deseja salvar
                writer.close();
            } catch (IOException err) {
                System.out.println("Erro ao salvar o arquivo: " + err.getMessage());
            }
            } else if (resultado == JFileChooser.CANCEL_OPTION) {
                // cancelado
            }
        
        return  showTextLabel.getText();
    }
    
    public String openTxt(){
        JFileChooser fileChooser = new JFileChooser();

        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            // O usuário selecionou um arquivo para abrir
            File arquivoSelecionado = fileChooser.getSelectedFile();

            // Agora você pode usar o arquivo selecionado, por exemplo, lendo seu conteúdo
            try {
                Scanner scanner = new Scanner(arquivoSelecionado);
                StringBuilder texto = new StringBuilder();
                while (scanner.hasNextLine()) {
                    texto.append(scanner.nextLine()).append("\n");
                }
                scanner.close();
                showTextLabel.setText(texto.toString());
                return texto.toString();
            } catch (FileNotFoundException err) {
                System.out.println("Arquivo não encontrado: " + err.getMessage());
            }
        } else if (resultado == JFileChooser.CANCEL_OPTION) {
            // O usuário cancelou a operação de abrir arquivo
        }
        return null;
    }

    
    private class Controller extends KeyAdapter{
        
    }
    
    public void question(){
        if(!this.savedContent.equals(this.showTextLabel.getText())){
            Object[] options = {
            "Sim, por favor",
            "Não, obrigado",
            "Cancelar" };
            int n = JOptionPane.showOptionDialog(null,
            "Você deseja salvar antes de sair?",
            "Fechando o programa",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, options, options[2]);  

            if(n == 0){
                saveTxt();
            }else if(n == 2){
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }else{
                 dispose();
            }
        }   
    }
    
}
