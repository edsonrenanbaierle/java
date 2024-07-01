/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DAL.LivroDAO;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import model.EnumLivro;
import model.Livro;

public class Frm_Cadastro extends JFrame implements ActionListener {

    private JButton butOK, butCancel;
    private JTextField campo1, campo2, campo3;
    private JComboBox<EnumLivro> campo4;
    private JFormattedTextField campo5;
    private JLabel id, titulo, autor, categoria, dataLancamento;
    private Livro newLivro;
    private ArrayList<Livro> lista;

    public Frm_Cadastro(Livro l, ArrayList<Livro> listLivros) throws ParseException {

        super("Cadastro de Livros");

        this.newLivro = l;
        this.setBounds(500, 200, 650, 450);

        JPanel pnl = new JPanel();

        pnl.setLayout(new GridLayout(6, 2, 20, 5));

        titulo = new JLabel("Titulo:");
        autor = new JLabel("Autor:");
        categoria = new JLabel("Categoria:");
        dataLancamento = new JLabel("Data de Lcto:");

        titulo.setHorizontalAlignment(SwingConstants.RIGHT);
        autor.setHorizontalAlignment(SwingConstants.RIGHT);
        categoria.setHorizontalAlignment(SwingConstants.RIGHT);
        dataLancamento.setHorizontalAlignment(SwingConstants.RIGHT);

        campo2 = new JTextField(15);
        campo3 = new JTextField(15);
        campo4 = new JComboBox<>(EnumLivro.values());
        campo5 = new JFormattedTextField();
        campo5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));

        butOK = new JButton("OK");

        butOK.addActionListener(this);

        butCancel = new JButton("Cancelar");
        butCancel.addActionListener(this);

        pnl.add(titulo);
        pnl.add(campo2);
        pnl.add(autor);
        pnl.add(campo3);
        pnl.add(categoria);
        pnl.add(campo4);
        pnl.add(dataLancamento);
        pnl.add(campo5);
        pnl.add(butOK);
        pnl.add(butCancel);

        this.setContentPane(pnl);

        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(butOK)) {
            if (campo2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o título do livro!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (campo3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o autor do livro!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (campo5.getText().replaceAll("\\s", "").replaceAll("/", "").length() != 8) {
                JOptionPane.showMessageDialog(null, "Informe a data de publicação do livro no formato DD/MM/AAAA!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                Livro novoLivro = new Livro();
                novoLivro.setAutor(campo3.getText());
                novoLivro.setTitulo(campo2.getText());
                novoLivro.setCategoria(EnumLivro.valueOf(campo4.getSelectedItem().toString()));
                novoLivro.setDataPublicacao(new Date(campo5.getText()));

                LivroDAO livroDAO = new LivroDAO();
                livroDAO.cadastrarLivro(novoLivro);

                JOptionPane.showMessageDialog(null, "Livro salvo com sucesso!");
                this.dispose();
            }
        } else {
            // Limpa os campos e fecha a janela
            campo2.setText("");
            campo3.setText("");
            campo4.setSelectedIndex(0);
            campo5.setText("");
            this.dispose();
        }

    }

}
